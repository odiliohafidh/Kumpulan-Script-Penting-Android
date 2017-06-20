mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng position) {
                Toast.makeText(TentukanLokasi.this,"Lokasi Anda :"+position.latitude+" : "+position.longitude, Toast.LENGTH_SHORT).show();
                Kordinat.setText(position.latitude+","+position.longitude);
                double lati = position.latitude;
                double loti = position.longitude;
                LatLng point = new LatLng(lati,loti);
                mMap.addMarker(new MarkerOptions()
                        .position(point)
                        .title("You are here")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
            }
        });
