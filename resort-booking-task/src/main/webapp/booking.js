function validateFirstName(){
let firstName=document.getElementById("first").value;
let button=document.getElementById("submitId");
if(firstName.length <=3){
    document.getElementById("show1").innerHTML="enter a first name   !";
    document.getElementById("show2").innerHTML="";
    button.setAttribute('disabled',"")
}else{
    document.getElementById("show1").innerHTML="";
    button.removeAttribute('disabled')
}
}

function validateLastName(){
    let lastName=document.getElementById("last").value;
    let button=document.getElementById("submitId");
    if(lastName.length < 1){
        document.getElementById("show3").innerHTML="enter last name  !";
        document.getElementById("show4").innerHTML="";
        button.setAttribute('disabled',"")
    }else{
        document.getElementById("show3").innerHTML="";
        button.removeAttribute('disabled')
    }
}
function validateEmail(){
    let mail=document.getElementById("mail1").value;
    let button=document.getElementById("submitId");
    if(mail.length < 5){
        document.getElementById("show5").innerHTML="enter a email id!";
        document.getElementById("show6").innerHTML="";
        button.setAttribute('disabled',"")
    }else{
        document.getElementById("show5").innerHTML="";
        button.removeAttribute('disabled')
    }
}
function validateNumber(){
    let number=document.getElementById("number1").value;
    let button=document.getElementById("submitId");
    if(number.length < 10){
        document.getElementById("show7").innerHTML="enter 10 digit mobile number!";
        document.getElementById("show8").innerHTML="";
        button.setAttribute('disabled',"")
    }else{
        document.getElementById("show7").innerHTML="";
        button.removeAttribute('disabled')
    }

}
function validatePayment(){
    let payment=document.getElementById("payment").value;
    let button=document.getElementById("submitId");
    if(payment == ""){
        document.getElementById("show9").innerHTML="select payment method !";
        document.getElementById("show10").innerHTML="";
        button.setAttribute('disabled',"")
    }else{
        document.getElementById("show9").innerHTML="";
        button.removeAttribute('disabled')
    }

}
function validateCheckIn(){
    let checkIn=document.getElementById("checkIn").value;
    let button=document.getElementById("submitId");
    if(checkIn <= 0){
        document.getElementById("show11").innerHTML="select check in date !";
        document.getElementById("show12").innerHTML="";
        button.setAttribute('disabled',"")
    }else{
        document.getElementById("show11").innerHTML="";
        button.removeAttribute('disabled')
    }
}
function validateCheckOut(){
    let checkOut=document.getElementById("checkOut").value;
    let button=document.getElementById("submitId");
    if(checkOut <= 0){
        document.getElementById("show13").innerHTML="select checkout date !";
        document.getElementById("show14").innerHTML="";
        button.setAttribute('disabled',"")
    }else{
        document.getElementById("show13").innerHTML="";
        button.removeAttribute('disabled')
    }

}
function validateAdult(){
    let adult=document.getElementById("adult").value;
    let button=document.getElementById("submitId");
    if(adult == 0){
        document.getElementById("show15").innerHTML="please enter number of adults !";
        document.getElementById("show16").innerHTML="";
        button.setAttribute('disabled',"")
    }else{
        document.getElementById("show15").innerHTML="";
        button.removeAttribute('disabled')
    }
}
function validateRoom(){
    let room=document.getElementById("room").value;
    let button=document.getElementById("submitId");
    if(room <= 0){
        document.getElementById("show17").innerHTML="enter number of rooms !";
        document.getElementById("show18").innerHTML="";
        button.setAttribute('disabled',"")
    }else{
        document.getElementById("show17").innerHTML="";
        button.removeAttribute('disabled')
    }
}