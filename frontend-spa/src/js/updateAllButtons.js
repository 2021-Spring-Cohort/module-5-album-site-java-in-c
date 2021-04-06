import { clearChildren } from "./updateSongs.js";
import { selectedAlbumJson } from "./updateSongs.js";
import { updateSongList } from "./updateSongs.js";

const updateAllButtons = function () {
  let songButton = document.querySelector("._songButton");
  let playlistButton = document.querySelector("._playlistButton");
  let commentButton = document.querySelector("._commentButton");

  songButton.addEventListener("click", () => clickOnSongButton());
  playlistButton.addEventListener("click", () => clickOnPlaylistButton());
  commentButton.addEventListener("click", () => clickOnCommentButton());
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
    <input class="_commentName" text="text" name="name" placeholder="Your name">
    <br>
    <input class="_commentBody" type="text" name="commentBody" placeholder="comment">
    <br>
    <input class="_commentSubmit" type="submit" value="Add Comment">
    `
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

export { updateAllButtons };
