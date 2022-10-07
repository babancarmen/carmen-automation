function My Alert (){
    window.alert("This is a popup");
}

function validateForm() {
    var userInput = document.getElementById("userNameInput").value;
    console.log(userInput);
    console.log(userInput.length);
    if(userInput.lenhth < 8 || userInput.lenhth > 30) {
    alert("user name is bwt 8 and 30");
    }
}
