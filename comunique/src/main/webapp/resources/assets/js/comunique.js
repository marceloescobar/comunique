

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
							
							 					$('#comuniqueForm').submit();
						 					}
						 },
					"button" :{"label" : "fechar","className" : "btn-sm"}
					
				}
			});
			
		}
	});
}


function abriMapa(url) {

	$.ajax({
		type: "GET",
		url: url,
		
		success: function(data) {
			
			bootbox.dialog({
				message: data,
				title: "Localização",
				buttons:{
					 
					"button" :{"label" : "fechar","className" : "btn-sm"}
					
				}
			});
			
		}
	});
	
	 var map = null;
	 var geocoder = null;
	initialize(map, geocoder);
	showAddress(document.getElementById('end').value, map, geocoder);
}

function initialize(map, geocoder) {
    
	if (GBrowserIsCompatible()) {
      map = new GMap2(document.getElementById("map"));
      map.setCenter(new GLatLng(-23.483901,-47.431884), 13);
		map.addControl(new GSmallMapControl());
      //map.addControl(new GMapTypeControl());

      geocoder = new GClientGeocoder();
    }
}

function showAddress(address, map, geocoder) {
	alert(geocoder);
	
    if (geocoder) {
      geocoder.getLatLng(
        address,
        function(point) {
          if (!point) {
            alert(address + " not found");
          } else {
            map.setCenter(point, 13);
            var marker = new GMarker(point);
            map.addOverlay(marker);
            marker.openInfoWindowHtml(document.getElementById('endereco').value);
          }
        }
      );
    }
}