document.addEventListener("DOMContentLoaded", () => {
    const myForm = document.getElementById("my-form");
    const userNameElement = document.getElementById("username");
    const userPasswordElement = document.getElementById("password");
    const submitButtonElement = document.getElementById("submit-btn");
    const usernameValidElement = document.getElementById('username-validation');
    const passwordValidElement = document.getElementById('password-validation');

    myForm.addEventListener("submit", (event) => {
        event.preventDefault();
        console.log(getUser());
    });

    userNameElement.addEventListener("input", (event) => {
        const inputUserElement = event.target;

        if (!inputUserElement.value) {
            inputUserElement.style.backgroundColor = "red";
            usernameValidElement.style.display = 'block';

            submitButtonElement.setAttribute('disabled', '');
        } else {
            inputUserElement.style.backgroundColor = "white";

            submitButtonElement.removeAttribute('disabled');
        }
    });

    userPasswordElement.addEventListener("input", (event) => {
        const inputPasswordElement = event.target;

        if (!inputPasswordElement.value) {
            inputPasswordElement.style.backgroundColor = "red";
            passwordValidElement.style.display = 'block';

            submitButtonElement.setAttribute('disabled', '');
        } else {
            inputPasswordElement.style.backgroundColor = "white";

            submitButtonElement.removeAttribute('disabled');
        }
    });
});


function getUser() {
    let userName = document.getElementById("username").value;
    let userPassword = document.getElementById("password").value;

    let newUser = { username: userName, password: userPassword };
    return newUser;
}