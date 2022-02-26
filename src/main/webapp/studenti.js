defaultTableHeader = "<tr><th>Id</th><th>Nome</th><th>Email</th><th>Età</th><th>Data di nascita</th></tr>";
$(document).ready(function(){
    $("#studentTable").html(defaultTableHeader);
    console.log("yo1");

    $.get("http://localhost:8080/studenti/getAllStudents", function(data){
        students = JSON.parse(data);

        for(var i = 0; i < students.length; i++){
            if(i % 2 == 0){
                tr = "<tr class='even'><td>";
            }else{
                tr = "<tr><td>";
            }
            tr += students[i].id + "</td><td>";
            tr += students[i].full_name + "</td><td>";
            tr += students[i].email + "</td><td>";
            tr += students[i].dob + "</td><td>";
            tr += students[i].age + "</td>";
            tr += "</tr>";
            $("#studentTable").append(tr);
        }
    });
});