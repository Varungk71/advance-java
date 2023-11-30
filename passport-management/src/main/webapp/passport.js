
function handleRadio(value)
{
var loginEmailInput=document.getElementById("loginid");

if(value=='yes')
{
    var emailOutput=document.getElementById("email");
    loginEmailInput.value=emailOutput.value;
    loginEmailInput.read0Only=true;
}
else{
    loginEmailInput.readOnly=false;
}
}

function validateName()
{
    let firstname=document.getElementById("gname").value;
    var status=false;

        if(firstname.length <= 3){
            document.getElementById("enter").innerHTML= "Please enter name greater than three char";
            document.getElementById("display").innerHTML="";
            status =false;
        }
        else{
            document.getElementById("enter").innerHTML="";
        }

        var surname=document.getElementById("surname").value;

        if(surname.length ==0)
    {

        document.getElementById("display1").innerHTML="Please enter sur name";
        document.getElementById("enter1").innerHTML= "";
        status=false;
    }
    else{
        document.getElementById("display1").innerHTML="";
    }
}

function validateEmail()
{
    var emailid=document.getElementById("email").value;

    if(emailid.length < 4)
    {
        document.getElementById("display2").innerHTML="enter email";
        document.getElementById("enter2").innerHTML="";
    }
    else{
        document.getElementById("display2").innerHTML="";
    }
}

function validatePassword()
{

    var password=document.getElementById("password1").value;
    var conpassword=document.getElementById("password2").value;

    if(password=="")
    {
        document.getElementById("display3").innerHTML="enter password";
        document.getElementById("enter3").innerHTML=""
    }
        else{
            console.log("passsword match");
            document.getElementById("display3").innerHTML="";
        // alert('password not matched');
    }

    if(conpassword== ""){
        document.getElementById("display4").innerHTML= "enter confirm password";
        document.getElementById("enter4").innerHTML="";
    }
    else{
        document.getElementById("display4").innerHTML= "";
    }

    if(password != conpassword){
        console.log("password didn't match");
        document.getElementById("display4").innerHTML= "password didnot match";
        document.getElementById("enter4").innerHTML="";
    }
    else{
        document.getElementById("display4").innerHTML= "";
    }
}