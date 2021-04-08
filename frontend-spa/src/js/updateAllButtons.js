import { addAlbumsToPage } from "./addAllAbums.js";
import { clearChildren } from "./updateSongs.js";
import { selectedAlbumJson } from "./updateSongs.js";
import { updateSongList } from "./updateSongs.js";
import { updateSelectedAlbum } from "./updateSongs.js";

const updateAllButtons = function () {
  let songButton = document.querySelector("._songButton");
  let playlistButton = document.querySelector("._playlistButton");
  let commentButton = document.querySelector("._commentButton");

  songButton.addEventListener("click", () => clickOnSongButton());
  playlistButton.addEventListener("click", () => clickOnPlaylistButton());
  commentButton.addEventListener("click", () => clickOnCommentButton());
};

const refreshAlbums = function (staticJson) {
  let albumStorage = document.querySelector("._albumStorage");
  clearChildren(albumStorage);
  addAlbumsToPage(staticJson);
  return staticJson;
};

const clickOnSongButton = function () {
  let songList = document.querySelector("._songList");
  clearChildren(songList);
  updateSongList(selectedAlbumJson);
};

const clickOnPlaylistButton = function () {
  let songList = document.querySelector("._songList");
  clearChildren(songList);
};

const clickOnCommentButton = function () {
  let songList = document.querySelector("._songList");
  clearChildren(songList);
  let commentForm = document.createElement("form");
  commentForm.classList.add("_commentForm");
  commentForm.innerHTML = `
    <div class="_commentDiv">
      <label for="name"><h4>Name:</h4></label>
      <input class="_commentName" text="text" name="name" placeholder="Your name">
      <br>
      <label for="name"><h4>Comment:</h4></label>
      <input class="_commentBody" type="text" name="body" placeholder="comment">
      <br>
      <button class="_commentSubmit">Add Comment</button>
    </div>
    `;
  let submitButton = commentForm.querySelector("._commentSubmit");

  submitButton.addEventListener("click", (clickEvent) => {
    let data = {
      body: commentForm.querySelector("._commentBody").value,
      name: commentForm.querySelector("._commentName").value,
    };
    clickEvent.preventDefault();
    fetch(
      "http://localhost:8080/api/albums/" + selectedAlbumJson.id + "/comment",
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
      }
    )
      .then((response) => response.json())
      .then((staticJson) => refreshAlbums(staticJson))
      .then((newJson) => makeNewComment(data, newJson))
      .then((lastJson) => updateSelectedAlbum(lastJson));
  });
  songList.appendChild(commentForm);

  selectedAlbumJson.comments.forEach((comment) => {
    let commentName = document.createElement("h3");
    commentName.classList.add("_commentName");
    commentName.innerText = comment.name;
    songList.appendChild(commentName);
    let commentBody = document.createElement("p");
    commentBody.classList.add("_commentBody");
    commentBody.innerText = comment.body;
    songList.appendChild(commentBody);
  });
};

const makeNewComment = function (newJson, otherJson) {
  let songList = document.querySelector("._songList");
  let commentName = document.createElement("h3");
  commentName.classList.add("_commentName");
  commentName.innerText = newJson.name;
  songList.appendChild(commentName);
  let commentBody = document.createElement("p");
  commentBody.classList.add("_commentBody");
  commentBody.innerText = newJson.body;
  songList.appendChild(commentBody);
  return otherJson;
};

export { updateAllButtons };
