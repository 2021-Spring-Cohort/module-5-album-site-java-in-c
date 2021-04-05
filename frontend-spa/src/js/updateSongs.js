let selectedAlbumJson = {};
let selectedAlbum = document.querySelector("._selectedAlbum");
let songHeader = document.querySelector("._songHeader");

const createArtistForHeader = function(album) {
    let artistElement = document.createElement("div");
    artistElement.classList.add("_selectedAlbumArtist");
    let artistH3 = document.createElement("h3");
    artistElement.classList.add("_selectedAlbumArtistHeader");
    artistH3.innerText = "Artist:"
    let artistName = document.createElement("p");
    let artists = "";
    album.artists.forEach(artist => {
        artists += artist.name + " ";
    });
    artists.substring(0, artists.length - 2);
    artists.replace(" ", ", ");
    artistName.innerText = artists;
    artistName.classList.add("_selectedAlbumArtistName");
    songHeader.appendChild(artistElement);
    artistElement.appendChild(artistH3);
    artistElement.appendChild(artistName);

    
}

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
    
    selectedAlbumJson = album;
    clearChildren(songHeader);
    createArtistForHeader(album);
    songHeader.appendChild(selectedAlbum);
    clearChildren(selectedAlbum);
    let albumImage = document.createElement("img");
    albumImage.classList.add("_selectedAlbumImage");
    albumImage.src = album.albumCoverUrl;
    selectedAlbum.appendChild(albumImage);
    createRatingForHeader(album);

}

const createRatingForHeader = function(album) {
    let ratingDiv = document.createElement("div");
    ratingDiv.classList.add("_selectedAlbumRatingDiv");
    let ratingH3 = document.createElement("h3");
    ratingH3.classList.add("_selectedAlbumRatingHeader");
    let rating = document.createElement("p");
    rating.classList.add("_selectedAlbumRating");
    ratingH3.innerText = "Rating:";
    let ratingString = "";
    for(let i = 0; i < album.rating; i++) {
        ratingString += "&#x2B50; ";
    }
    ratingString = ratingString.substring(0, ratingString.length - 1);
    rating.innerHTML = ratingString;
    ratingDiv.appendChild(ratingH3);
    ratingDiv.appendChild(rating);
    songHeader.appendChild(ratingDiv);
}



export {selectedAlbumJson}
export {updateSongList}
export {clearChildren}