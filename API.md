
# APIs for certain topics

We are providing API for accessing our data for the following topics:

                    Fathers in Agriculture - https://api.npoint.io/89534022862ac4fb7a4a
                    Institutes in India -  https://api.npoint.io/9f3e5f4f1d0cc81bd68f
                    International Institutes - https://api.npoint.io/fdf1d9dc75b79851292c 
                    
Just copy the above mentioned link and place it in the place of _link_


Use the following method to fetch the data from the link provided, as of now we are providing only for Android:
  >Just copy and paste, if you find alternate method don't hesitate to tell us!
  >We have used Async task for fetching the data
  >You can also use request network component for fetching the data
		
	      new BackTask().execute (link);

              }

              private class BackTask extends AsyncTask<String, Integer, String> {

              @Override

              protected void onPreExecute() {}

              protected String doInBackground(String... address) {

              String output = "";

              try {

              java.net.URL url = new java.net.URL(address[0]);

              java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream()));

              String line;

              while ((line = in.readLine()) != null) {

              output += line;

              }

              in.close(); } catch (java.net.MalformedURLException e) {

              output = e.getMessage();

              } catch (java.io.IOException e) {

              output = e.getMessage();

              } catch (Exception e) {

              output = e.toString();

              }

              return output;

              }


              protected void onProgressUpdate(Integer... values) {}


              protected void onPostExecute(String s){

              ist = s;



              maplist = new Gson().fromJson(ist, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
              listview1.setAdapter(new Listview1Adapter(maplist));
              ((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
              }
	
          
  
  ### Fathers in Agriculture:
  
  For listview OnBindCustomView assign two textview as mentioned below
  
  		textview1.setText(maplist.get((int)_position).get("subject").toString());
		textview2.setText(maplist.get((int)_position).get("father").toString());
 		
 The JSON structure is 
 
      [
         {
           "subject": "Father of Agronomy",
           "father": "Pitro decrescenzi"
         }
      ]
      
 ### Institutes related to Agriculture in India
 
 For listview OnBindCustomView assign two textview as mentioned below
 
		 textview1.setText(maplist.get((int)_position).get("institute").toString());
		 textview2.setText(maplist.get((int)_position).get("location").toString());
		  
 The JSON structure is
 
 	[
	  {
	    "institute": "Central tobacco research institute is situated at",
	    "location": "Raja Mundri, AP (1947)"
	  }
	]
        

 
 ### International Institutes related to Agriculture
 
 For listview OnBindCustomView assign two textview as mentioned below
 
		textview1.setText(maplist.get((int)_position).get("institute").toString());
		textview2.setText(maplist.get((int)_position).get("location").toString());
 
The JSON structure is
 
	 [
	  {
	    "institute": "International Rice Research Institute (IRRI)",
	    "location": "Manila, Philippines"
	  }
	 ]
 
For assistance contact us :v:
