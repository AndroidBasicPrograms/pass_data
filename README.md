# pass_data

Activity to Activity

      Intent i=new Intent(this,activity.java);
      i.putExtra(data,"hello");
      startActivity(i);
      
Collect data

      Intent i=getIntent();
      String s=i.getStringExtra(data);
