
function balances() {
    $.ajax("http://localhost:8080/discovery/transactionsBalances", {
        data: JSON.stringify({
            "clientAccountNumber": 4055230225
        }),
        method: "POST",
        contentType: "application/json"

    });

    text = "<ul>";
    for (var a = 0; a < 2; a++) {

        text += "<li>" + "welcome " + "</li>";

    }
    text += "</ul>";
    document.getElementById("demo").innerHTML = text;
}


function FinancialPositionPerClient() {

    var value = [];

    $.getJSON("http://localhost:8080/discovery/financialPositionPerClient", function (abc) {

        value = abc;
        console.log(value);
        console.table(value);
        document.write(JSON.stringify(abc));
                
        var tr=[];
            
        for (var i = 0; i < abc.length; i++) {
          
                tr.push('<tr>');
                 tr.push('<td>' + abc[i].clientId + '</td>');
                tr.push('<td>' + abc[i].title + '</td>');
                tr.push('<td>' + abc[i].name+ '</td>');
                tr.push('<td>' + abc[i].surname + '</td>');
                tr.push('<td>' + abc[i].agregateLoan+ '</td>');
                tr.push('<td>' + abc[i].agregateBalance+ '</td>');
                tr.push('<td>' + abc[i].totalAgregate+ '</td>');
                tr.push('</tr>');
               
        };

            $('table').append($(tr.join('')));
    });
}

function allClientHighestBalance() {

     $.getJSON("http://localhost:8080/discovery/allclient", function (ab) {

        console.log(ab);
        console.table(ab);
        document.write(JSON.stringify(ab));
    });
}

function withdrawals() {
    $.ajax("http://localhost:8080/discovery/withdrawals", {
        data: JSON.stringify({
            "accountNumber": 1002222785,
            "atmId": 3,
            "amount":3,
            "reference": "20204178"
        }),
        method: "POST",
        contentType: "application/json"

    });
    document.getElementById("demo").innerHTML = "Withdrawals";
}

function RandBalance(){
    $.ajax("http://localhost:8080/discovery/balanceInRandValue", {
        data: JSON.stringify({
            "clientAccountNumber": 1002222785
        }),
        method: "GET",
        contentType: "application/json"

    });
    document.getElementById("demo").innerHTML = "Balance In Rand Value";
}