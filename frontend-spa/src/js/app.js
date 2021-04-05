import { setStaticJson } from "./staticJson.js";
import { addAlbumsToPage } from "./addAllAbums.js";
import { showLoginPage } from "./PopUpFeature.js";
import { updateAllButtons } from "./updateAllButtons.js";

async function run() {
  let staticJson = await setStaticJson();
  addAlbumsToPage(staticJson);
  updateAllButtons();
  showLoginPage();
}

run();
