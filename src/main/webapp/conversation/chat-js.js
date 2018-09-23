


    
   
  




function previewFile() {
  var preview = document.querySelector('img');
  var file    = document.querySelector('input[type=file]').files[0];
  var reader  = new FileReader();

  reader.addEventListener("load", function () {
    preview.width=500;
    preview.src = reader.result;
  }, false);

  if (file) {
    reader.readAsDataURL(file);
  }
  

  //upload(file);
  
  
  
   //var img = new Image();


   //img.createElement("IMG");
   //img.width="150";
   //img.height="130";
   //var ul = document.getElementById("messages");
   // var li = document.createElement("li"); 
   // li.img.createElement("IMG");
   
  //  li.appendChild(image);
   // ul.appendChild(li);
  return true;
  
}



function sendMessage() {
   

  console.log(window.usernameinput);
//Get chat form input, append to list object and print
    var input = document.getElementById('textinput').value;
    var ul = document.getElementById("messages");
    var li = document.createElement("li"); 
    var img = new Image();
    img.src = "avatar.png";
    img.width = 20;
    
    li.appendChild(img);
    li.appendChild(document.createTextNode("Me: "+ input));  
    ul.appendChild(li);
    previewFile();
    
  //clear chat form  
    document.getElementById("textinput").value = "";
    
    
    
    
    
    //autoscroll to bottom of chat
    chatWindow = document.getElementById('messages'); 
    var xH = chatWindow.scrollHeight; 
    chatWindow.scrollTo(0, xH);
    
    
    //load avatar pic

  
 

return true;
    
    
   
};
//Pressing enter to send message
  document.getElementById("textinput").addEventListener("keyup", function(event) {
    event.preventDefault();
    if (event.keyCode === 13) {
        document.getElementById('sendbtn').click();
    }
});   

   


class User {
    constructor(uid,name) {
        this.uid = uid;
        this.name = name;
    }
}

class Message {
    constructor(sender, text, date, img = null) {
        this.sender = sender;
        this.text = text;
        this.date = date;
        this.img = img;
    }
}

class Conversation {
    constructor(from, to = new Set(), messages = []) {
        this.from = from;
        this.to = to;
        this.messages = messages;
    }
}









   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/***
 * Setup application
 */
