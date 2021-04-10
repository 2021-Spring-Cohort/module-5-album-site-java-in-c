// import { staticJson } from "./staticJson.js";
import { updateSongList } from "./updateSongs.js"

let albumStorage = document.querySelector("._albumStorage");




const createImageElement = function(album) {
    let imgElement = document.createElement("img");
    imgElement.classList.add("_singleAlbum");
    imgElement.src = album.albumCoverUrl;
    imgElement.addEventListener("click", () => updateSongList(album));
    albumStorage.appendChild(imgElement);
}



const addAlbumsToPage = function(staticJson) {
    staticJson.forEach(album => {
        createImageElement(album);
    });
}


export { addAlbumsToPage }