var number_of_buttons = document.querySelectorAll(".drum").length

for (var i = 0; i<number_of_buttons; i++){
   
    document.querySelector(".drum")[i].addEventListener("click",function clicked(){
        alert("clicked!!!")
    });

}

