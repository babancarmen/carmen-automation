function myAlert() {
    window.alert("This is a popup");
}

function validateForm(id) {
    var userInputElement = document.getElementById(id);
    var userInput = userInputElement.value;
    userInputElement.style = "background-color:#f1ffd6;";
    document.getElementById(id+'ErrorText').innerText = "";
//    console.log(userInput);
//    console.log(userInputElement);
//    console.log(userInput.length);
    if (userInput.length <= 0 ) {
        document.getElementById(id+'ErrorText').innerText=" This field is required!";
        //userInputElement.style = "background-color:#b843b6;";
        userInputElement.classList.add("error");
    }
}

function validatePassword() {
    var passwordElement = document.getElementById('passwordInput');
    var confirmationPasswordElement = document.getElementById('passwordConfirmInput');
    console.log("Password " + passwordElement.value + "  " + confirmationPasswordElement.value)
    if (passwordElement.value != confirmationPasswordElement.value){
        console.log ("Password does not match");
        document.getElementById('passwordConfirmInputErrorText').innerText="Password does not match!";
        confirmationPasswordElement.classList.add("error");
    }
}

function validateRadio(name){
    var elements = document.getElementsByName(name);
    var isChecked = false;
    for ( var i = 0; i < elements.length; i++) {
        if(elements[i].checked) {
            isChecked = true;
        }
    }
//    console.log("radio " + name + " checked=" + isChecked);
    if(! isChecked){
        document.getElementById(name+'ErrorText').innerText="This field is required!";
    }else{
        document.getElementById(name+'ErrorText').innerText="";
    }
}

function validateFormAll() {
    validateForm("firstNameInput");
    validateForm("lastNameInput");
    validateForm("usernameInput");
    validateForm("emailInput");
    validateForm("passwordInput");
    validateForm("passwordConfirmInput");
    validateForm("passwordConfirmInput");
    validatePassword();
    validateRadio("sex");
    validateForm("aboutYouInput");
}

function resetFormAll(){
    document.forms[0].reset();
    resetFormElement("firstNameInput");
    resetFormElement("lastNameInput");
    resetFormElement("usernameInput");
    resetFormElement("emailInput");
    resetFormElement("passwordInput");
    resetFormElement("passwordConfirmInput");
    resetFormElement("aboutYouInput");
}

function resetFormElement(id) {
    var userInputElement = document.getElementById(id);
    userInputElement.classList.remove("error");
    document.getElementById(id+'ErrorText').innerText = "";
}