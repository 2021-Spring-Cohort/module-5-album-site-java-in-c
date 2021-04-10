let selectedAlbumJson = {};
let selectedAlbum = document.querySelector("._selectedAlbum");
let songHeader = document.querySelector("._songHeader");

const createArtistForHeader = function (album) {
  let artistElement = document.createElement("div");
  artistElement.classList.add("_selectedAlbumArtist");
  let artistH3 = document.createElement("h3");
  artistElement.classList.add("_selectedAlbumArtistHeader");
  artistH3.innerText = "Artist:";
  let artistName = document.createElement("p");
  let artists = "";
  album.artists.forEach((artist) => {
    artists += artist.name + " ";
  });
  artists.substring(0, artists.length - 2);
  artists.replace(" ", ", ");
  artistName.innerText = artists;
  artistName.classList.add("_selectedAlbumArtistName");
  songHeader.appendChild(artistElement);
  artistElement.appendChild(artistH3);
  artistElement.appendChild(artistName);
};

const updateSongList = function (album) {
  let songList = document.querySelector("._songList");
  clearChildren(songList);
  createSelectedAlbum(album);

  album.songs.forEach((song) => {
    let songData = document.createElement("div");
    songData.classList.add("_singleSong");
    songData.innerHTML = "&#9208;" + song.name;

    songData.addEventListener("click", () => {
      clearChildren(songList);
      const singleSongDiv = document.createElement("div");
      singleSongDiv.classList.add("_aboutSingleSong");

      const insideSingleSongDiv1 = document.createElement("div");
      const insideSingleSongDiv2 = document.createElement("div");
      const insideSingleSongDiv3 = document.createElement("div");

      insideSingleSongDiv1.classList.add("_insideSingleSongDiv1");
      insideSingleSongDiv2.classList.add("_insideSingleSongDiv2");
      insideSingleSongDiv3.classList.add("_insideSingleSongDiv3");

      const singleSongTitle = document.createElement("h4");
      const singleSongArtists = document.createElement("h4");
      const singleSongDuration = document.createElement("h4");
      singleSongTitle.innerHTML = `Song Title: ` + song.name;
      singleSongArtists.innerHTML = `Artists: `;
      song.artists.forEach((artist) => {
        const listOfArtist = document.createElement("li");
        listOfArtist.innerHTML = artist.name;
        singleSongArtists.appendChild(listOfArtist);
      });
      singleSongDuration.innerHTML = "Song Duration: " + song.duration;

      insideSingleSongDiv1.appendChild(singleSongTitle);
      insideSingleSongDiv1.appendChild(singleSongArtists);
      insideSingleSongDiv1.appendChild(singleSongDuration);

      insideSingleSongDiv2.innerHTML = `
      <div class="_commentDiv">
        <label for="name"><h4>Name:</h4></label>
        <input class="_commentName" text="text" name="name" placeholder="Your name">
        <br>
        <label for="name"><h4>Comment:</h4></label>
        <input class="_commentBody" type="text" name="body" placeholder="comment">
        <br>
        <label for="name"><h4>Rating:</h4></label>
        <input class="_commentBody" type="text" name="body" placeholder="rating">
        <br>
        <button class="_commentSubmit">Add Review</button>
    </div>
    <hr class="_hrLine1">
      `;
      songList.appendChild(singleSongDiv);
      singleSongDiv.appendChild(insideSingleSongDiv1);
      singleSongDiv.appendChild(insideSingleSongDiv2);
      singleSongDiv.appendChild(insideSingleSongDiv3);
    });

    songList.appendChild(songData);
  });
};

const clearChildren = function (element) {
  while (element.firstChild) {
    element.removeChild(element.lastChild);
  }
};

const createSelectedAlbum = function (album) {
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
};

const createRatingForHeader = function (album) {
  let ratingDiv = document.createElement("div");
  ratingDiv.classList.add("_selectedAlbumRatingDiv");
  let ratingH3 = document.createElement("h3");
  ratingH3.classList.add("_selectedAlbumRatingHeader");
  let rating = document.createElement("p");
  rating.classList.add("_selectedAlbumRating");
  ratingH3.innerText = "Rating:";
  let ratingString = "";
  for (let i = 0; i < album.rating; i++) {
    ratingString += "&#x2B50; ";
  }
  ratingString = ratingString.substring(0, ratingString.length - 1);
  rating.innerHTML = ratingString;
  ratingDiv.appendChild(ratingH3);
  ratingDiv.appendChild(rating);
  songHeader.appendChild(ratingDiv);
};

const updateSelectedAlbum = function (newJson) {
  newJson.forEach((album) => {
    if (selectedAlbumJson.id === album.id) {
      selectedAlbumJson = album;
    }
  });
};

export { updateSelectedAlbum };
export { selectedAlbumJson };
export { updateSongList };
export { clearChildren };
