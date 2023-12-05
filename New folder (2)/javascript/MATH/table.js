var table=document.createElement("table")
var tr1=document.createElement("tr")
var tr2=document.createElement("tr")
var td1=document.createElement("td")
var td2=document.createElement("td")
var td4=document.createElement("td")
var td5=document.createElement("td")
td1.innerHTML=`<h1>1</h1>`
td2.innerHTML=`<h1>2</h1>`
td4.innerText=`4`
td5.innerText=`5`
var aside=document.querySelector("aside")
aside.appendChild(table)
table.appendChild(tr1)
table.appendChild(tr2)
tr1.append(td1,td2)
tr2.append(td4,td5)
table.style.border="2px solid red"
