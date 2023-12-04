// let obj={name:name}

// let convert=JSON.stringify(obj);

// window.localStorage.setItem("register","after");
// let get=localStorage.getItem("register");

// let object=JSON.parse(get);
// console.log(object);

function validateFirstName(){
    var first=document.getElementById("first").value;
        var btn=document.getElementById("but");


    if(first.length < 4){
        document.getElementById("display1").innerHTML="enter first name";
        document.getElementById("display2").innerHTML="";
btn.setAttribute("disabled"," ");
    }
    else{
        document.getElementById("display1").innerHTML="";
        document.getElementById("display7").innerHTML="first name is valid";
    }

    let obj={firstName:first};

    let obj2=JSON.stringify(obj);
    window.localStorage.setItem("firstname",obj2);
    let get=localStorage.getItem("firstname");

    let object=JSON.parse(get);
    console.log(object);
}

function validateMiddleName(){

    var middlename=document.getElementById("middle").value;

    if(middlename.length <1){
        document.getElementById("display3").innerHTML="enter middle name";
        document.getElementById("display2").innerHTML="";
    }
    else{
        document.getElementById("display3").innerHTML="";
        document.getElementById("display8").innerHTML="middle name is valid";
    }
    let obj={middleName:middlename};

    let obj2=JSON.stringify(obj);
    window.localStorage.setItem("middleName",obj2);
    let get=localStorage.getItem("middleName");

    let object=JSON.parse(get);
    console.log(object);
}
function validateLastName(){

    var lastname=document.getElementById("last").value;

    if(lastname.length < 1){
        document.getElementById("display4").innerHTML="enter last name";
        document.getElementById("display2").innerHTML="";
    }
    else{
        document.getElementById("display4").innerHTML="";
        document.getElementById("display9").innerHTML="last name is valid";
    }
    let obj={lastName:lastname};

    let obj2=JSON.stringify(obj);
    window.localStorage.setItem("lastName",obj2);
    let get=localStorage.getItem("lastName");

    let object=JSON.parse(get);
    console.log(object);
}

function validateHouse(){

    var house=document.getElementById("house").value;

    if(house.length < 1){
        document.getElementById("address1").innerHTML="enter house no";
        document.getElementById("address2").innerHTML="";
    }
    else{
        document.getElementById("address1").innerHTML="";
    }
    let obj={houseNum:house};

    let obj2=JSON.stringify(obj);
    window.localStorage.setItem("houseNum",obj2);
    let get=localStorage.getItem("houseNum");

    let object=JSON.parse(get);
    console.log(object);
}

function validateStreet(){

    var street=document.getElementById("street").value;

    if(street.length < 1){
        document.getElementById("address3").innerHTML="enter street";
        document.getElementById("address2").innerHTML="";
    }
    else{
        document.getElementById("address3").innerHTML="";
    }
    let obj={streetName:street};

    let obj2=JSON.stringify(obj);
    window.localStorage.setItem("streetName",obj2);
    let get=localStorage.getItem("streetName");

    let object=JSON.parse(get);
    console.log(object);
}
function validateCity(){

    var city=document.getElementById("city").value;

    if(city.length < 1){
        document.getElementById("address4").innerHTML="enter city";
        document.getElementById("address2").innerHTML="";
    }
    else{

        document.getElementById("address4").innerHTML="";
    }
    let obj={cityName:city};

    let obj2=JSON.stringify(obj);
    window.localStorage.setItem("cityName",obj2);
    let get=localStorage.getItem("cityName");

    let object=JSON.parse(get);
    console.log(object);
}
function validateDistrict(){

    var district=document.getElementById("distric").value;

    if(district.length < 1){
        document.getElementById("address5").innerHTML="enter district";
        document.getElementById("address2").innerHTML="";
    }
    else{
        document.getElementById("address5").innerHTML="";
    }
    let obj={distric:district};

    let obj2=JSON.stringify(obj);
    window.localStorage.setItem("distric",obj2);
    let get=localStorage.getItem("distric");

    let object=JSON.parse(get);
    console.log(object);
}

function validatePincode(){

    var pincode=document.getElementById("pincode").value;

    if(pincode.length < 1){
        document.getElementById("address6").innerHTML="enter pincode";
        document.getElementById("address2").innerHTML="";
    }
    else{
        document.getElementById("address6").innerHTML="";
    }
    let obj={pinCode:pincode};

    let obj2=JSON.stringify(obj);
    window.localStorage.setItem("pinCode",obj2);
    let get=localStorage.getItem("pinCode");

    let object=JSON.parse(get);
    console.log(object);
}

function validateState(){
    var statename=document.getElementById("state").value;

    if(statename == "null"){
        document.getElementById("state1").innerHTML="please select state";
        document.getElementById("state2").innerHTML="";
    }
    else{
        document.getElementById("state1").innerHTML="";
    }
}

function handleRadio(){

}// let obj={name:name}

 // let convert=JSON.stringify(obj);

 // window.localStorage.setItem("register","after");
 // let get=localStorage.getItem("register");

 // let object=JSON.parse(get);
 // console.log(object);

 function validateFirstName(){
     var first=document.getElementById("first").value;

     if(first.length < 4){
         document.getElementById("display1").innerHTML="enter first name";
         document.getElementById("display2").innerHTML="";

         // document.getElementById("submit").setAttribute="disable";
     }
     else{
         document.getElementById("display1").innerHTML="";
         document.getElementById("display7").innerHTML="first name is valid";
     }

     let obj={firstName:first};

     let obj2=JSON.stringify(obj);
     window.localStorage.setItem("firstname",obj2);
     let get=localStorage.getItem("firstname");

     let object=JSON.parse(get);
     console.log(object);
 }

 function validateMiddleName(){

     var middlename=document.getElementById("middle").value;

     if(middlename.length <1){
         document.getElementById("display3").innerHTML="enter middle name";
         document.getElementById("display2").innerHTML="";
     }
     else{
         document.getElementById("display3").innerHTML="";
         document.getElementById("display8").innerHTML="middle name is valid";
     }
     let obj={middleName:middlename};

     let obj2=JSON.stringify(obj);
     window.localStorage.setItem("middleName",obj2);
     let get=localStorage.getItem("middleName");

     let object=JSON.parse(get);
     console.log(object);
 }
 function validateLastName(){

     var lastname=document.getElementById("last").value;

     if(lastname.length < 1){
         document.getElementById("display4").innerHTML="enter last name";
         document.getElementById("display2").innerHTML="";
     }
     else{
         document.getElementById("display4").innerHTML="";
         document.getElementById("display9").innerHTML="last name is valid";
     }
     let obj={lastName:lastname};

     let obj2=JSON.stringify(obj);
     window.localStorage.setItem("lastName",obj2);
     let get=localStorage.getItem("lastName");

     let object=JSON.parse(get);
     console.log(object);
 }

 function validateHouse(){

     var house=document.getElementById("house").value;

     if(house.length < 1){
         document.getElementById("address1").innerHTML="enter house no";
         document.getElementById("address2").innerHTML="";
     }
     else{
         document.getElementById("address1").innerHTML="";
     }
     let obj={houseNum:house};

     let obj2=JSON.stringify(obj);
     window.localStorage.setItem("houseNum",obj2);
     let get=localStorage.getItem("houseNum");

     let object=JSON.parse(get);
     console.log(object);
 }

 function validateStreet(){

     var street=document.getElementById("street").value;

     if(street.length < 1){
         document.getElementById("address3").innerHTML="enter street";
         document.getElementById("address2").innerHTML="";
     }
     else{
         document.getElementById("address3").innerHTML="";
     }
     let obj={streetName:street};

     let obj2=JSON.stringify(obj);
     window.localStorage.setItem("streetName",obj2);
     let get=localStorage.getItem("streetName");

     let object=JSON.parse(get);
     console.log(object);
 }
 function validateCity(){

     var city=document.getElementById("city").value;

     if(city.length < 1){
         document.getElementById("address4").innerHTML="enter city";
         document.getElementById("address2").innerHTML="";
     }
     else{

         document.getElementById("address4").innerHTML="";
     }
     let obj={cityName:city};

     let obj2=JSON.stringify(obj);
     window.localStorage.setItem("cityName",obj2);
     let get=localStorage.getItem("cityName");

     let object=JSON.parse(get);
     console.log(object);
 }
 function validateDistrict(){

     var district=document.getElementById("distric").value;

     if(district.length < 1){
         document.getElementById("address5").innerHTML="enter district";
         document.getElementById("address2").innerHTML="";
     }
     else{
         document.getElementById("address5").innerHTML="";
     }
     let obj={distric:district};

     let obj2=JSON.stringify(obj);
     window.localStorage.setItem("distric",obj2);
     let get=localStorage.getItem("distric");

     let object=JSON.parse(get);
     console.log(object);
 }

 function validatePincode(){

     var pincode=document.getElementById("pincode").value;

     if(pincode.length < 1){
         document.getElementById("address6").innerHTML="enter pincode";
         document.getElementById("address2").innerHTML="";
     }
     else{
         document.getElementById("address6").innerHTML="";
     }
     let obj={pinCode:pincode};

     let obj2=JSON.stringify(obj);
     window.localStorage.setItem("pinCode",obj2);
     let get=localStorage.getItem("pinCode");

     let object=JSON.parse(get);
     console.log(object);
 }

 function validateState(){
     var statename=document.getElementById("state").value;

     if(statename == "null"){
         document.getElementById("state1").innerHTML="please select state";
         document.getElementById("state2").innerHTML="";
     }
     else{
         document.getElementById("state1").innerHTML="";
     }
 }

