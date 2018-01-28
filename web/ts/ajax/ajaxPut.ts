/// <reference path="../data/Team.ts"/>

namespace ajaxPut {
    export function team(name : string) {
        $.ajax({
            method: "GET",
            url: "http://localhost:4040",
            data: { r: "addTeam", n: name },
            dataType: "json",
            success: function (data) {
                if ("error" in data) {
                    console.log(data);
                    alert("Error adding team: " + data.error);
                } else {
                    console.info("Team added: " + data);
                    //callback(data.teams);
                }
            },
            error: function (data : JQueryXHR, textStatus : string, errorThrown : string) {
                console.info(data.statusText + data.status + " -> " +  textStatus + ": " + errorThrown + " < " + data.responseText);
            },
            cache: false
        });
    }
}