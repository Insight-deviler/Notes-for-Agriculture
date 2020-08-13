package sar.agri.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.graphics.Typeface;

public class ActsActivity extends AppCompatActivity {
	
	
	private ArrayList<HashMap<String, Object>> acts = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> act = new ArrayList<>();
	
	private ListView listview1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.acts);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		listview1 = (ListView) findViewById(R.id.listview1);
	}
	private void initializeLogic() {
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "National Seed Corporation established in");
			acts.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "Seed act was enacted by the parliament");
			acts.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "Seed Rules notified in");
			acts.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "Seed act was implemented entirely in");
			acts.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "National Seed Project");
			acts.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "Seed control order issued");
			acts.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "New policy on seed development");
			acts.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "National seed policy");
			acts.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("a", "Seed bill");
			acts.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("b", "1963");
			act.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("b", "1966");
			act.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("b", "1968");
			act.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("b", "October 1969");
			act.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("b", "1976");
			act.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("b", "1983");
			act.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("b", "1988");
			act.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("b", "2002");
			act.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("b", "2004");
			act.add(_item);
		}
		
		listview1.setAdapter(new Listview1Adapter(acts));
		listview1.setAdapter(new Listview1Adapter(act));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _setElevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
		
		
	}
	
	
	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _view, ViewGroup _viewGroup) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _v = _view;
			if (_v == null) {
				_v = _inflater.inflate(R.layout.acts_main, null);
			}
			
			final LinearLayout linear4 = (LinearLayout) _v.findViewById(R.id.linear4);
			final LinearLayout linear1 = (LinearLayout) _v.findViewById(R.id.linear1);
			final LinearLayout linear2 = (LinearLayout) _v.findViewById(R.id.linear2);
			final TextView textview1 = (TextView) _v.findViewById(R.id.textview1);
			final TextView textview2 = (TextView) _v.findViewById(R.id.textview2);
			
			textview1.setText(acts.get((int)_position).get("a").toString());
			textview2.setText(act.get((int)_position).get("b").toString());
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansregular.ttf"), 0);
			textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansregular.ttf"), 0);
			
			return _v;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
