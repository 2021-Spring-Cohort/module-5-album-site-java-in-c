"use strict";
const pianoButton = document.querySelector("._headerMenu");
const loginPage = document.querySelector("._popUpPages");
const albumPage = document.querySelector("._albumStorage");
const goBackButton = document.querySelector("._goBack");
const signInTab = document.querySelector("._loginFormSignIn");
const signUpTab = document.querySelector("._loginFormSignUp");
const signInContent = document.querySelector("._signIn");
const signUpContent = document.querySelector("._signUp");
const loginTabContent = document.querySelector("._loginTabContent");
const submitTabContent = document.querySelector("._submitTabContent");
const submitTab = document.querySelector("._submitTab");
const accountTab = document.querySelector("._loginTab");

const showAccountTab = () => {
  accountTab.addEventListener("click", () => {
    submitTabContent.style.display = "none";
    loginTabContent.style.display = "flex";
  });
};
const changeToSubmitForm = () => {
  submitTab.addEventListener("click", () => {
    loginTabContent.style.display = "none";
    submitTabContent.style.display = "flex";
  });
};

//switch signin and signup tabs
const switchFromSignInTabToSignUpTab = () => {
  signInTab.addEventListener("click", () => {
    signUpContent.style.display = "none";
    signInContent.style.display = "flex";
  });
};
const switchFromSignUpTabToSignInTab = () => {
  signUpTab.addEventListener("click", () => {
    signUpContent.style.display = "flex";
    signInContent.style.display = "none";
  });
};
const shouldGoBack = () => {
  goBackButton.addEventListener("click", () => {
    loginPage.style.display = "none";
    albumPage.style.display = "flex";
    submitTabContent.style.display = "none";
    loginTabContent.style.display = "none";
  });
};
// sets popup page on and off
const showLoginPage = () => {
  let flag = true;
  pianoButton.addEventListener("click", () => {
    if (flag) {
      submitTabContent.style.display = "none";
      loginPage.style.display = "flex";
      albumPage.style.display = "none";
      loginTabContent.style.display = "flex";
      flag = false;
    } else {
      loginPage.style.display = "none";
      albumPage.style.display = "flex";
      loginTabContent.style.display = "none";
      flag = true;
    }
  });
  showAccountTab();
  changeToSubmitForm();
  switchFromSignInTabToSignUpTab();
  switchFromSignUpTabToSignInTab();
  shouldGoBack();
};

export { showLoginPage };
