function validateName()
{
    let name=document.getElementById("name").value;
    let button=document.getElementById("submit");


    if(name.length <= 3 )
    {
          document.getElementById("display1").innerHTML="please enter a name !!";
          document.getElementById("display2").innerHTML="";
          button.setAttribute('disabled',"")
    }
    else{
        document.getElementById("display1").innerHTML="";
        button.removeAttribute('disabled')
    }
}
function validateMail()
{
    let mail=document.getElementById("mail").value;
    let button=document.getElementById("submit");
    if(mail.length <= 5)
    {

        document.getElementById("display3").innerHTML="please enter email id !!";
        document.getElementById("display4").innerHTML="";
        button.setAttribute('disabled',"")

    }
    else{
        document.getElementById("display3").innerHTML="";
        button.removeAttribute('disabled')
    }
}
function validateNumber()
{
    let number=document.getElementById("number").value;
    let button=document.getElementById("submit");
    if(number.length < 10)
    {
        document.getElementById("display5").innerHTML="please enter 10 digit mobile number !!";
        document.getElementById("display6").innerHTML="";
        button.setAttribute('disabled',"")
    }
    else{
        document.getElementById("display5").innerHTML="";
        button.removeAttribute('disabled')
    }
}
function validateComment()
{
    let comment=document.getElementById("comment").value;
    let button=document.getElementById("submit");

    if(comment.length <= 25)
    {
        document.getElementById("display7").innerHTML="This field is mandatary !!";
        document.getElementById("display8").innerHTML="";
        button.setAttribute('disabled',"")
    }
    else{
        document.getElementById("display7").innerHTML="";
        button.removeAttribute('disabled')
    }
}