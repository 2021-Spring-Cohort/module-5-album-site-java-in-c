


const updateSongList = function(album) {
    let songList = document.querySelector("._songList");
    clearChildren(songList);
    createSelectedAlbum(album);
    album.songs.forEach(song => {
        let songData = document.createElement("div");
        songData.classList.add("_singleSong");
        songData.innerHTML = "&#9208;" + song.name;
        songList.appendChild(songData);
    });
}


const clearChildren = function(element) {
    while(element.firstChild) {
        element.removeChild(element.lastChild);
    }

}

const createSelectedAlbum = function(album) {
    let selectedAlbum = document.querySelector("._selectedAlbum");
    clearChildren(selectedAlbum);
    let albumImage = document.createElement("img");
    albumImage.classList.add("_selectedAlbumImage");
    albumImage.src = album.albumCoverUrl;
    selectedAlbum.appendChild(albumImage);

}


export {updateSongList}