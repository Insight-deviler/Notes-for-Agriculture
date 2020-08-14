package sar.agri.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.app.Activity;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	private boolean rooted = false;
	
	private ArrayList<String> drawer = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> maplist = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private ImageView drawer_open;
	private TextView actionbar;
	private ImageView imageview2;
	private ImageView imageview1;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private Button button13;
	private Button button1;
	private Button button18;
	private Button button15;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button19;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button14;
	private Button button9;
	private Button button17;
	private Button button11;
	private Button button10;
	private Button button12;
	private Button button16;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear4;
	private TextView _drawer_textview1;
	
	private Intent i = new Intent();
	private FirebaseAuth fauth;
	private OnCompleteListener<Void> fauth_updateEmailListener;
	private OnCompleteListener<Void> fauth_updatePasswordListener;
	private OnCompleteListener<Void> fauth_emailVerificationSentListener;
	private OnCompleteListener<Void> fauth_deleteUserListener;
	private OnCompleteListener<Void> fauth_updateProfileListener;
	private OnCompleteListener<AuthResult> fauth_phoneAuthListener;
	private OnCompleteListener<AuthResult> fauth_googleSignInListener;
	private OnCompleteListener<AuthResult> _fauth_create_user_listener;
	private OnCompleteListener<AuthResult> _fauth_sign_in_listener;
	private OnCompleteListener<Void> _fauth_reset_password_listener;
	private SharedPreferences user;
	private AlertDialog.Builder Exit;
	private AlertDialog.Builder Gene;
	private SharedPreferences reward;
	private SharedPreferences admin_;
	private AlertDialog.Builder onetime;
	private SharedPreferences onetimenot;
	private TimerTask in;
	private AlertDialog.Builder upload;
	private RequestNetwork connect;
	private RequestNetwork.RequestListener _connect_request_listener;
	private Intent intent = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		drawer_open = (ImageView) findViewById(R.id.drawer_open);
		actionbar = (TextView) findViewById(R.id.actionbar);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		button13 = (Button) findViewById(R.id.button13);
		button1 = (Button) findViewById(R.id.button1);
		button18 = (Button) findViewById(R.id.button18);
		button15 = (Button) findViewById(R.id.button15);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button19 = (Button) findViewById(R.id.button19);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button14 = (Button) findViewById(R.id.button14);
		button9 = (Button) findViewById(R.id.button9);
		button17 = (Button) findViewById(R.id.button17);
		button11 = (Button) findViewById(R.id.button11);
		button10 = (Button) findViewById(R.id.button10);
		button12 = (Button) findViewById(R.id.button12);
		button16 = (Button) findViewById(R.id.button16);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = (LinearLayout) _nav_view.findViewById(R.id.linear2);
		_drawer_linear5 = (LinearLayout) _nav_view.findViewById(R.id.linear5);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		fauth = FirebaseAuth.getInstance();
		user = getSharedPreferences("user", Activity.MODE_PRIVATE);
		Exit = new AlertDialog.Builder(this);
		Gene = new AlertDialog.Builder(this);
		reward = getSharedPreferences("reward", Activity.MODE_PRIVATE);
		admin_ = getSharedPreferences("admin_", Activity.MODE_PRIVATE);
		onetime = new AlertDialog.Builder(this);
		onetimenot = getSharedPreferences("onetimenot", Activity.MODE_PRIVATE);
		upload = new AlertDialog.Builder(this);
		connect = new RequestNetwork(this);
		
		drawer_open.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.openDrawer(GravityCompat.START);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((FirebaseAuth.getInstance().getCurrentUser() != null)) {
					FirebaseAuth.getInstance().signOut();
					user.edit().remove("email").commit();
					user.edit().remove("password").commit();
					user.edit().remove("login").commit();
					admin_.edit().remove("admin_login").commit();
					InsightUtil.showMessage(getApplicationContext(), "Logged out successfully!");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Already logged out");
				}
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AccountActivity.class);
				startActivity(i);
			}
		});
		
		button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), GeneralAgriActivity.class);
				startActivity(i);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AgronomyActivity.class);
				startActivity(i);
			}
		});
		
		button18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AgriBotanyActivity.class);
				startActivity(i);
			}
		});
		
		button15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), BiotechActivity.class);
				startActivity(i);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), EconomicsActivity.class);
				startActivity(i);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), EntomologyActivity.class);
				startActivity(i);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ExtensionActivity.class);
				startActivity(i);
			}
		});
		
		button19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), GeneticsActivity.class);
				startActivity(i);
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), GpbActivity.class);
				startActivity(i);
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), HorticultureActivity.class);
				startActivity(i);
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), MicrobiologyActivity.class);
				startActivity(i);
			}
		});
		
		button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), NematologyActivity.class);
				startActivity(i);
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PathologyActivity.class);
				startActivity(i);
			}
		});
		
		button17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SeedActivity.class);
				startActivity(i);
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), SoilScienceActivity.class);
				startActivity(i);
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), StatisticsActivity.class);
				startActivity(i);
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AnimalHusbandryActivity.class);
				startActivity(i);
			}
		});
		
		button16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), AgriengActivity.class);
				startActivity(i);
			}
		});
		
		_connect_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _response = _param2;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				InsightUtil.showMessage(getApplicationContext(), "No connection available");
			}
		};
		
		fauth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task){
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		fauth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task){
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_fauth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_fauth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_fauth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	private void initializeLogic() {
		connect.startRequestNetwork(RequestNetworkController.GET, "https://www.google.com", "a", _connect_request_listener);
		_One_timNotifi();
		
		 getSupportActionBar().hide();
		
		
		
		actionbar.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansbold.ttf"), 1);
		_setElevation(linear1, 10);
		_root_check();
		drawer.add("Add your Questions");
		drawer.add("Challenge a Question");
		drawer.add("Nutritional defects in plants");
		drawer.add("Fathers in Agriculture");
		drawer.add("Acts/Policies related to Agriculture");
		drawer.add("Institute in Agriculture");
		drawer.add("Gene and roles");
		drawer.add("About");
		_listview_drawer();
		_drawer_textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansbold.ttf"), 1);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		Exit.setTitle("Exit?");
		Exit.setMessage("Are you sure of your action");
		Exit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finishAffinity();
				int pid = android.os.Process.myPid();
				android.os.Process.killProcess(pid); 
			}
		});
		Exit.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		Exit.create().show();
	}
	private void _setElevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
		
		
	}
	
	
	private void _One_timNotifi () {
		if (onetimenot.getString("one", "").equals("")) {
			onetime.setMessage("Read our Privacy Policy, Terms and Conditions before you continue");
			onetime.setPositiveButton("Read", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					i.setAction(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://insight-deviler.github.io/Notes-for-Agriculture/"));
					startActivity(i);
				}
			});
			onetime.setNegativeButton("Accept", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					onetimenot.edit().putString("one", "false").commit();
				}
			});
			onetime.create().show();
		}
		else {
			if (onetimenot.getString("one", "").equals("false")) {
				
			}
			else {
				
			}
		}
	}
	
	
	private void _root_check () {
		try {
			Runtime.getRuntime().exec("/system/xbin/which su"); 
			rooted = true; 
		} catch (Exception e) { 
			rooted = false; 
		} 
		
		if(rooted) return;
		
		
		if (rooted) {
			InsightUtil.showMessage(getApplicationContext(), "This app can't run on rooted device");
			finishAffinity();
			int pid = android.os.Process.myPid();
			android.os.Process.killProcess(pid); 
		}
		else {
			
		}
	}
	
	
	private void _listview_drawer () {
		ListView listview1 = new ListView(this);
		LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(
		LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
		listview1.setLayoutParams(lp1);
		
		listview1.setAdapter(new ArrayAdapter(getBaseContext(), android.R.layout.simple_list_item_1, drawer));
		
		_drawer_linear1.addView(listview1);
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						@Override
						public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
								final int _position = _param3;
								if (_position == 0) {
										
										
									
					if (user.getString("login", "").equals("success")) {
						upload.setMessage("Signing up alone can't give you permission to add question without admin permission");
						upload.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								i.setClass(getApplicationContext(), UploadActivity.class);
								i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
								startActivity(i);
							}
						});
						upload.create().show();
					}
					else {
						InsightUtil.showMessage(getApplicationContext(), "Permission denied");
					}
				}
				
					if (_position == 1) {
										 
										
									
					Intent intent=new Intent(Intent.ACTION_SEND); String[] recipients={"insightagri10@gmail.com"}; intent.putExtra(Intent.EXTRA_EMAIL, recipients); intent.putExtra(Intent.EXTRA_SUBJECT,"Notes for Agriculture question challenge"); intent.putExtra(Intent.EXTRA_TEXT,"Enter the question..."); intent.putExtra(Intent.EXTRA_CC,"mailcc@gmail.com"); intent.setType("text/html"); intent.setPackage("com.google.android.gm"); startActivity(Intent.createChooser(intent, "Send mail"));
					
				}
				if (_position == 2) {
											
									
					i.setClass(getApplicationContext(), NutrientDefectActivity.class);
					startActivity(i);
				}
				if (_position == 3) {
					
					i.setClass(getApplicationContext(), FathersActivity.class);
					startActivity(i);
				}
					if (_position == 4) {
					
					i.setClass(getApplicationContext(), ActsActivity.class);
					startActivity(i);
				}
					if (_position == 5) {
					
					i.setClass(getApplicationContext(), InstituteActivity.class);
					startActivity(i);
				}
					if (_position == 6) {
					
					i.setClass(getApplicationContext(), GeneActivity.class);
					i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(i);
					}
					
				
					if (_position == 7) {
					
					i.setClass(getApplicationContext(), AboutActivity.class);
					startActivity(i);
					}
				}
			});
		
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
