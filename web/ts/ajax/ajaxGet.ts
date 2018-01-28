/// <reference path="../data/Team.ts"/>

namespace ajaxGet {
    export function teams(callback : (teams: TeamJSON[]) => any) {
        $.ajax({
            method: "GET",
            url: "http://localhost:4040",
            data: { r: "getTeams" },
            dataType: "json",
            success: function (data) {
                if ("error" in data) {
                    console.log(data);
                    alert("Error fetching teams: " + data.error);
                } else {
                    console.info("Teams fetched: " + data.teams);
                    callback(data.teams);
                }
            },
            error: function (data : JQueryXHR, textStatus : string, errorThrown : string) {
                console.info(data.statusText + data.status + " -> " +  textStatus + ": " + errorThrown + " < " + data.responseText);
            },
            cache: false
        });
    }
}