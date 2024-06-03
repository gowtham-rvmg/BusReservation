
function Tdate(){
   
    let date = new Date().toISOString().split('T')[0];
    document.getElementById("SAdate").setAttribute("min",date);
    
 }