/// <reference path="../data/Team.ts"/>

namespace ajaxGet {
    export function teams(callback : (teams: TeamJSON[]) => any) {
        $.ajax({
            method: "GET",
            url: "35.196.202.58:4040",
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
            cache: false
        });
    }
}