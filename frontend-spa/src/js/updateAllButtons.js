import {clearChildren} from "./updateSongs.js";
import {selectedAlbumJson} from "./updateSongs.js";
import {updateSongList} from "./updateSongs.js";

const updateAllButtons = function() {
    let songButton = document.querySelector("._songButton");
    let playlistButton = document.querySelector("._playlistButton");
    let commentButton = document.querySelector("._commentButton");

    songButton.addEventListener("click", () => clickOnSongButton());
    playlistButton.addEventListener("click", () => clickOnPlaylistButton());
    commentButton.addEventListener("click", () => clickOnCommentButton());

};

const clickOnSongButton = function() {
    let songList = document.querySelector("._songList");
    clearChildren(songList);
    updateSongList(selectedAlbumJson);
}

const clickOnPlaylistButton = function() {
    let songList = document.querySelector("._songList");
    clearChildren(songList);
}

const clickOnCommentButton = function() {
    let songList = document.querySelector("._songList");
    clearChildren(songList);
    selectedAlbumJson.comments.forEach(comment => {
        let commentName = document.createElement("h3");
        commentName.classList.add("_commentName");
        commentName.innerText = comment.name;
        songList.appendChild(commentName);
        let commentBody = document.createElement("p");
        commentBody.classList.add("_commentBody");
        commentBody.innerText = comment.body;
        songList.appendChild(commentBody);
    });
}


export {updateAllButtons}