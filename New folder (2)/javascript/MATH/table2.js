var table=document.createElement("table")
var tr1=document.createElement("tr")
var tr2=document.createElement("tr")
var tr3=document.createElement("tr")
var tr4=document.createElement("tr")

var td1=document.createElement("td")
var td2=document.createElement("td")
var td3=document.createElement("td")
var td4=document.createElement("td")
var td5=document.createElement("td")
var td6=document.createElement("td")
var td7=document.createElement("td")
var td8=document.createElement("td")
var td9=document.createElement("td")
var td10=document.createElement("td")
var td11=document.createElement("td")
var td12=document.createElement("td")
var td13=document.createElement("td")
var td14=document.createElement("td")
var td15=document.createElement("td")
var td16=document.createElement("td")

td1.innerHTML=`<h1> my table </h1>`
td5.innerHTML=`<h1>1</h1>`
td6.innerHTML=`<h1>2</h1>`
td7.innerHTML=`<h1>3</h1>`
td8.innerHTML=`<h1>4</h1>`
td9.innerHTML=`<h1>5</h1>`
td10.innerHTML=`<h1>6</h1>`
td11.innerHTML=`<h1>7</h1>`
td12.innerHTML=`<h1>8</h1>`
td13.innerHTML=`<h1>9</h1>`
td14.innerHTML=`<h1>10</h1>`
td15.innerHTML=`<h1>11</h1>`
td16.innerHTML=`<h1>12</h1>`

var aside=document.body.querySelector("aside")
aside.appendChild(table)
table.append(tr1,tr2,tr3,tr4)
tr1.append(td1,td2,td3,td4)
tr2.append(td5,td6,td7,td8)
tr3.append(td9,td10,td11,td12)
tr4.append(td13,td14,td15,td16)
td1.colSpan=4;

table.style.border="2px solid red"
td1.style.border="2px solid green"

