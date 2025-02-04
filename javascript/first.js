window.onload = function () {
    const greeting = document.getElementById("jai");
    const name = document.getElementById("shree");
    const button = document.getElementById("ram");
    button.addEventListener('click',function(){
        const new1 = name.value;
        if(new1==""){
            alert("enter a name");
        }
        else{
            button.textContent="ram "+new1;
        }
    })
}