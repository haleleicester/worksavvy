/**
 * Created by rzsavilla on 10/11/2015.
 */

function Generate() { //Save data onto local storage
    if (typeof (Storage) !== "undefined") {     //Check for local storage
        //Has Local Storage;
        var table = document.getElementsById("")
    }
    else {
        //No Local Storage
    }
}

function addTask() { //Takes step number
    var table = document.getElementById("myTable")
    var footer = table.createTFoot();

    var row = footer.insertRow(table.rows.length - 1);
    var check = row.insertCell(0);
    var description = row.insertCell(0);
    var number = row.insertCell(0);

    description.innerHTML = "<input type='text'> </input>";
    check.innerHTML = "<input type='checkbox'> </input>"
    number.innerHTML = table.rows.length - 1;
}