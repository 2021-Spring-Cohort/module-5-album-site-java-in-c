import { staticJson } from "./staticJson.js";

let albumStorage = document.querySelector("._albumStorage");

const createImageElement = function(album) {
    let imgElement = document.createElement("img");
    imgElement.classList.add("_singleAlbum");
    imgElement.src = album.albumCoverUrl;
    albumStorage.appendChild(imgElement);

}
const addAlbumsToPage = function() {
    staticJson.forEach(album => {
        createImageElement(album);
    });
}


export { addAlbumsToPage }