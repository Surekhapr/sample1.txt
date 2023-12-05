var name1=document.querySelector("#name1")
var phone=document.querySelector("#phone")
var id=document.querySelector("#id1")
var storage=document.querySelector("#storage")
var add=document.querySelector("#add")
var get=document.querySelector("#get")
var remove=document.querySelector("#remove")
var clear=document.querySelector("#clear")

add.addEventListener("click",function(){
  var  nval=name1.value;
  var   pval=phone.value;
  var  ival=id1.value;
  var   sval=storage.value;

    console.log(nval)
    console.log(pval)
    console.log(ival)
    console.log(sval)

    if(sval=="session")
    {
        sessionStorage.setItem("name_session",nval)
        sessionStorage.setItem("id_session",ival)
        sessionStorage.setItem("phnee_session",pval)
    }
    else
    {
        localStorageStorage.setItem("name_session",nval)
        localStoragetorage.setItem("id_session",ival)
    localStorage.setItem("phnee_session",pval)
    }

},false
)

clear.addEventListener("click",()=>{
    if(sval=="local")
    {
        localStorage.clear()
    }
    else
    {
        sessionStorage.clear()
    }
})

localStorage.setItem("name","suresh")
localStorage.setItem("id","007")
localStorage.setItem("age",100)
localStorage.setItem("gender","male")

console.log(localStorage.setItem("id"))
console.log(localStorage.setItem("name"))
console.log(localStorage.setItem("age"))
console.log(localStorage.setItem("gender"))
