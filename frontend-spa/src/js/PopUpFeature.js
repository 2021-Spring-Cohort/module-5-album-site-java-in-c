"use strict";
const pianoButton = document.querySelector("._headerMenu");
const loginPage = document.querySelector("._popUpPages");
const albumPage = document.querySelector("._albumStorage");
const goBackButton = document.querySelector("._goBack");
const signInTab = document.querySelector("._loginFormSignIn");
const signUpTab = document.querySelector("._loginFormSignUp");
const signInContent = document.querySelector("._signIn");
const signUpContent = document.querySelector("._signUp");


//switch signin and signup tabs
const switchFromSignInTabToSignUpTab = () => {
    signInTab.addEventListener("click", ()=>{
        signUpContent.style.display = "none";
        signInContent.style.display = "flex";
    });
}
const switchFromSignUpTabToSignInTab = () => {
    signUpTab.addEventListener("click", () => {
        signUpContent.style.display = "flex";
        signInContent.style.display = "none";
    });
}



// sets popup page on and off
const showLoginPage = () => {
    let flag = true;
    pianoButton.addEventListener("click", ()=> {
        if(flag) {
            loginPage.style.display = "flex";
            albumPage.style.display = "none";
            flag = false;
        } else {
            loginPage.style.display = "none";
            albumPage.style.display = "flex";
            flag = true;
        }
    
    });
}
const shouldGoBack = () => {
    goBackButton.addEventListener("click", () => {
        loginPage.style.display = "none";
            albumPage.style.display = "flex";
    });
}
switchFromSignInTabToSignUpTab();
switchFromSignUpTabToSignInTab();
shouldGoBack();
showLoginPage();