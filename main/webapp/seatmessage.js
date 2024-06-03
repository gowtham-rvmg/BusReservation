
function seatcount(){
    let heading = document.getElementById("heading");
    heading.innerText=" Seat-Availabilities! ";

    let title = document.getElementById("title");
    title.innerText="Seat-Availabilities";

    let seatStatus = false;

if(seatStatus)
{
    let failmessage = document.getElementById("failerMessage");
    failmessage.innerText="Currenty No Seats are available :( "
}
else{

seatmessage();

}

function seatmessage(){
    let tablecontiner = document.getElementById("tablecontiner");
    let tablebase = document.createElement('table');
    tablebase.id = "busdetails";
    tablecontiner.appendChild(tablebase)
    
    let table = document.getElementById("busdetails");
    var busno = document.createElement('tr');
    var td1 = busno.appendChild(document.createElement('td'));
    var td2 = busno.appendChild(document.createElement('td'));
    
    td1.innerText="No. of Seat's available:";
    td2.id="seatcount";
    td2.innerText="3";
    
    table.appendChild(busno);
   
    tablecontiner.appendChild(table);

}


}



function cancelmessage(seatStatus){

    let heading = document.getElementById("heading");
    heading.innerText=" Ticket Cancelation ";

    let title = document.getElementById("title");
    title.innerText="Ticket-Cancelation";

    // let seatStatus = false;

if(seatStatus)
{
    let failmessage = document.getElementById("failerMessage");
    failmessage.innerText="Your Booking Cancellation failed :( "
}
else{
    let failmessage = document.getElementById("failerMessage");
    failmessage.innerText="Your Booking has been cancelled successfully :)"

}



}

const key = window.location.search;
const urlparams = new URLSearchParams(key);

let hiddenvalue = urlparams.get('hidden');
if(hiddenvalue>0){
    let seatStatus = true;
    cancelmessage(seatStatus);
}
else{
    seatcount();
}