function comunique(url) {

	$.ajax({
		type: "GET",
		url: url,
		
		success: function(data) {
			
			bootbox.dialog({
				message: data,
				title: "Comunique",
				buttons:{
					 success: {
						 label: "salvar",
						 className: "btn-success",
						 callback: function() {
							 Example.show("great success");
						 }
						 },
					"button" :{"label" : "fechar","className" : "btn-sm"}
					
				}
			});
			
		}
	});
}