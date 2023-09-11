$("#button").click(function() {
    $.ajax({
        url: "/getFirstHint",
        method: "GET",
        success: function(response) {
            $("#firstHint").text(response);
        },
        error: function() {
            console.log("Error");
        }
    });
});

function openPage() {
    window.location.href = "WordsGame/src/main/resources/templates/game.html";
}