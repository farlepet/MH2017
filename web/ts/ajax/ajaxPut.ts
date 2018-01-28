/// <reference path="../data/Team.ts"/>

namespace ajaxPut {
    export function team(name : string) {
        $.ajax({
            method: "GET",
            url: "35.196.202.58:4040",
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
            cache: false
        });
    }
}