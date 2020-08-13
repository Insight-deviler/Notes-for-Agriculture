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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;

public class AboutActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private String sub = "";
	private String text = "";
	private String versionCode = "";
	private String versionName = "";
	
	private ArrayList<String> contact = new ArrayList<>();
	
	private LinearLayout linear7;
	private ScrollView vscroll1;
	private TextView textview2;
	private LinearLayout linear9;
	private LinearLayout linear22;
	private LinearLayout linear11;
	private LinearLayout linear10;
	private LinearLayout linear16;
	private ImageView imageview1;
	private TextView textview22;
	private TextView textview4;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear23;
	private LinearLayout linear15;
	private TextView textview9;
	private TextView textview13;
	private TextView textview10;
	private TextView textview14;
	private TextView textview11;
	private TextView textview15;
	private TextView textview23;
	private TextView textview24;
	private TextView textview12;
	private TextView textview16;
	private TextView textview3;
	private LinearLayout l1;
	private LinearLayout l2;
	private LinearLayout l3;
	private LinearLayout l4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview17;
	private LinearLayout linear17;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private TextView textview18;
	private TextView textview19;
	private TextView textview20;
	private TextView textview21;
	
	private AlertDialog.Builder credits;
	private Intent i = new Intent();
	private TimerTask timer;
	private Intent intent = new Intent();
	private AlertDialog.Builder Apppolicy;
	private AlertDialog.Builder Appterms;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.about);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview3 = (TextView) findViewById(R.id.textview3);
		l1 = (LinearLayout) findViewById(R.id.l1);
		l2 = (LinearLayout) findViewById(R.id.l2);
		l3 = (LinearLayout) findViewById(R.id.l3);
		l4 = (LinearLayout) findViewById(R.id.l4);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview17 = (TextView) findViewById(R.id.textview17);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
		textview21 = (TextView) findViewById(R.id.textview21);
		credits = new AlertDialog.Builder(this);
		Apppolicy = new AlertDialog.Builder(this);
		Appterms = new AlertDialog.Builder(this);
		
		textview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(linear12);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://instagram.com/saraths10?igshid=q3p1mkm4fslh"));
				startActivity(i);
			}
		});
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(linear13);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://instagram.com/arunmastro_03?igshid=eklyxu3s1i0r"));
				startActivity(i);
			}
		});
		
		linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(linear14);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://instagram.com/bharathprabha_?igshid=m5vzlutz8xg7"));
				startActivity(i);
			}
		});
		
		linear23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(linear23);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.canva.com"));
				startActivity(i);
			}
		});
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(linear15);
				credits.setTitle("Icons provider sites");
				credits.setMessage("Which provider do you wish to visit");
				credits.setPositiveButton("Icons8", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						i.setAction(Intent.ACTION_VIEW);
						i.setData(Uri.parse("https://www.icons8.com"));
						startActivity(i);
					}
				});
				credits.setNegativeButton("Flaticon", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						i.setAction(Intent.ACTION_VIEW);
						i.setData(Uri.parse("https://www.flaticon.com"));
						startActivity(i);
					}
				});
				credits.create().show();
			}
		});
		
		l1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(l1);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://instagram.com/insightagri?igshid=8d9hgxxbnlkq"));
				startActivity(i);
			}
		});
		
		l2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(l2);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.facebook.com/sarath.sekar.146"));
				startActivity(i);
			}
		});
		
		l3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(l3);
				Intent intent=new Intent(Intent.ACTION_SEND); String[] recipients={"insightagri10@gmail.com"}; intent.putExtra(Intent.EXTRA_EMAIL, recipients); intent.putExtra(Intent.EXTRA_SUBJECT,"Notes for Agriculture"); intent.putExtra(Intent.EXTRA_TEXT,"Hello..."); intent.putExtra(Intent.EXTRA_CC,"mailcc@gmail.com"); intent.setType("text/html"); intent.setPackage("com.google.android.gm"); startActivity(Intent.createChooser(intent, "Send mail"));
				
			}
		});
		
		l4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(l4);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://github.com/Insight-deviler/Notes-for-Agriculture"));
				startActivity(i);
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(linear17);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://insight-deviler.github.io/Notes-for-Agriculture/"));
				startActivity(i);
			}
		});
		
		linear19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(linear19);
				Apppolicy.setTitle("App privacy policy");
				Apppolicy.setMessage("Insight Agri built the Notes for Agriculture app as a Ad-supported app. This SERVICE is provided by Insight Agri at no cost and is intended for use as is.\n\nThis page is used to inform visitors regarding my policies with the collection, use, and disclosure of Personal Information if anyone decided to use my Service.\n\nIf you choose to use my Service, then you agree to the collection and use of information in relation to this policy. The Personal Information that I collect is used for providing and improving the Service. I will not use or share your information with anyone except as described in this Privacy Policy.\n\nThe terms used in this Privacy Policy have the same meanings as in our Terms and Conditions, which is accessible at Notes for Agriculture unless otherwise defined in this Privacy Policy.\n\nInformation Collection and Use:\n\nFor a better experience, while using our Service, I may require you to provide us with certain personally identifiable information, limited to Email ID only(collected only when you contact us). The information that I request will be retained unless required.\n\nThe app does use third party services that may collect information used to identify you and these third-party services may also request additional permission which is not linked to the developer.\n\nReference to third party service providers used by the app are below:\n\nFirebase.  Admob.  Google Play Services.    Facebook.   StartApp         \n\nLog Data:\n\nI want to inform you that whenever you use my Service, in a case of an error in the app I collect data and information (through third party products) on your phone called Log Data. This Log Data may include information such as your device Internet Protocol (“IP”) address, device name, operating system version, the configuration of the app when utilizing my Service, the time and date of your use of the Service, and other statistics.\n\nCookies:\n\nCookies are files with a small amount of data that are commonly used as anonymous unique identifiers. These are sent to your browser from the websites that you visit and are stored on your device's internal memory.\n\nThis Service does not use these “cookies” explicitly. However, the app may use third party code and libraries that use “cookies” to collect information and improve their services. You have the option to either accept or refuse these cookies and know when a cookie is being sent to your device. If you choose to refuse our cookies, you may not be able to use some portions of this Service.\n\nService Providers:\n\nI may employ third-party companies and individuals due to the following reasons:\n\nTo facilitate our Service;To provide the Service on our behalf;To perform Service-related services; or To assist us in analyzing how our Service is used.\n\nI want to inform users of this Service that these third parties have access to your Personal Information. The reason is to perform the tasks assigned to them on our behalf. However, they are obligated not to disclose or use the information for any other purpose.\n\nSecurity:\n\nI value your trust in providing us your Personal Information, thus we are striving to use commercially acceptable means of protecting it. But remember that no method of transmission over the internet, or method of electronic storage is 100% secure and reliable, and I cannot guarantee its absolute security.\n\nLinks to Other Sites:\n\nThis Service may contain links to other sites. If you click on a third-party link, you will be directed to that site. Note that these external sites are not operated by me. Therefore, I strongly advise you to review the Privacy Policy of these websites. I have no control over and assume no responsibility for the content, privacy policies, or practices of any third-party sites or services.\n\nChildren’s Privacy:\n\nThese Services do not address anyone under the age of 16. I do not knowingly collect personally identifiable information from children under 16. In a case I discover that a child under 16 has provided me with personal information, I immediately delete this from our servers. If you are a parent or guardian and you are aware that your child has provided us with personal information, please contact me so that I will be able to take necessary actions.\n\nChanges to This Privacy Policy:\n\nI may update our Privacy Policy from time to time. Thus, you are advised to review this page periodically for any changes. I will notify you of any changes by posting the new Privacy Policy on this page.\n\nThis policy is effective as of 12-08-2020\n\nContact Us:\n\nIf you have any questions or suggestions about my Privacy Policy, do not hesitate to contact me at insightagri10@gmail.com");
				Apppolicy.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Apppolicy.create().show();
			}
		});
		
		linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(linear20);
				Appterms.setTitle("App terms and conditions");
				Appterms.setMessage("This terms and conditions only speak about this app and not about the source code in the GitHub. To know about the source code visit our GitHub page.  By downloading or using the app, these terms will automatically apply to you – you should make sure therefore that you read them carefully before using the app. Since this app is open sourced you must only use the source data available in the GitHub and therefore not extract the source from the app. You’re not allowed to copy, or modify the app, any part of the app, or our trademarks in any way. You’re not allowed to use the app icon without prior permission, and you may  translate the app into other languages, or make derivative versions only from the source code available in the GitHub. The app itself, and all the trade marks, copyright, database rights and other intellectual property rights related to it, still belong to Insight Agri. The server side is not open sourced so you must not try to use it.\n\nInsight Agri is committed to ensuring that the app is as useful and efficient as possible. For that reason, we reserve the right to make changes to the app or to charge for its services, at any time and for any reason. We will never charge you for the app or its services without making it very clear to you exactly what you’re paying for.\n\nThe Notes for Agriculture app stores and processes personal data that you have provided to us, in order to provide my Service. It’s your responsibility to keep your phone and access to the app secure. We therefore recommend that you do not jailbreak or root your phone, which is the process of removing software restrictions and limitations imposed by the official operating system of your device. It could make your phone vulnerable to malware/viruses/malicious programs, compromise your phone’s security features and it could mean that the miz app won’t work properly or at all.\n\nThe app does use third party services that declare their own Terms and Conditions.\n\nTerms and Conditions of third party service providers used by the app are bound to owners.\n\nFirebase.  Admob.  Google Play Services.    Facebook.            \n\nYou should be aware that there are certain things that Insight Agri will not take responsibility for. Certain functions of the app will require the app to have an active internet connection. The connection can be Wi-Fi, or provided by your mobile network provider, but Insight Agri cannot take responsibility for the app not working at full functionality if you don’t have access to Wi-Fi, and you don’t have any of your data allowance left.\n\nIf you’re using the app outside of an area with Wi-Fi, you should remember that your terms of the agreement with your mobile network provider will still apply. As a result, you may be charged by your mobile provider for the cost of data for the duration of the connection while accessing the app, or other third party charges. In using the app, you’re accepting responsibility for any such charges, including roaming data charges if you use the app outside of your home territory (i.e. region or country) without turning off data roaming. If you are not the bill payer for the device on which you’re using the app, please be aware that we assume that you have received permission from the bill payer for using the app.\n\nAlong the same lines, Insight Agri cannot always take responsibility for the way you use the app i.e. You need to make sure that your device stays charged – if it runs out of battery and you can’t turn it on to avail the Service, Insight Agri cannot accept responsibility.\n\nWith respect to Insight Agri’s responsibility for your use of the app, when you’re using the app, it’s important to bear in mind that although we endeavour to ensure that it is updated and correct at all times, we do rely on third parties to provide information to us so that we can make it available to you. Insight Agri accepts no liability for any loss, direct or indirect, you experience as a result of relying wholly on this functionality of the app.\n\nAt some point, we may wish to update the app. The app is currently available on Android – the requirements for system(and for any additional systems we decide to extend the availability of the app to) may change, and you’ll need to download the updates if you want to keep using the app. Insight Agri does not promise that it will always update the app so that it is relevant to you and/or works with the Android version that you have installed on your device. However, you promise to always accept updates to the application when offered to you, We may also wish to stop providing the app, and may terminate use of it at any time without giving notice of termination to you. Unless we tell you otherwise, upon any termination, (a) the rights and licenses granted to you in these terms will end; (b) you must stop using the app, and (if needed) delete it from your device.\n\nChanges to This Terms and Conditions:\n\nI may update our Terms and Conditions from time to time. Thus, you are advised to review this page periodically for any changes. I will notify you of any changes by posting the new Terms and Conditions on this page.\n\nThese terms and conditions are effective as of 12-08-2020.\n\nContact Us:\n\nIf you have any questions or suggestions about my Terms and Conditions, do not hesitate to contact me at insightagri10@gmail.com.");
				Appterms.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Appterms.create().show();
			}
		});
		
		linear21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Ripple_Effect(linear21);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://sumxas.blogspot.com/?m=1"));
				startActivity(i);
			}
		});
	}
	private void initializeLogic() {
		
		//Create variable versionName and versionCode
		String versionName = "null";
		int versionCode = -1;
		try {
			android.content.pm.PackageInfo packageInfo = AboutActivity.this.getPackageManager().getPackageInfo(getPackageName(), 0);
			versionName = packageInfo.versionName;
			versionCode = packageInfo.versionCode;
		} catch (android.content.pm.PackageManager.NameNotFoundException e) {
			e.printStackTrace();
		}
		//textview set text
		TextView textViewVersionInfo = (TextView) findViewById(R.id.textview22);
		textViewVersionInfo.setText(String.format("Version Name: %s Version Code:%d", versionName, versionCode));
		_typeface(textview2);
		_setElevation(linear7, 10);
		int[] colorsCRNNX = { Color.parseColor("#ffffff"), Color.parseColor("#ffffff") }; android.graphics.drawable.GradientDrawable CRNNX = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNNX);
		CRNNX.setCornerRadii(new float[]{(int)20,(int)20,(int)20,(int)20,(int)20,(int)20,(int)20,(int)20});
		CRNNX.setStroke((int) 0, Color.parseColor("#000000"));
		linear10.setElevation((float) 5);
		linear10.setBackground(CRNNX);
		
		int[] colorsCRNAQ = { Color.parseColor("#ffffff"), Color.parseColor("#ffffff") }; android.graphics.drawable.GradientDrawable CRNAQ = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNAQ);
		CRNAQ.setCornerRadii(new float[]{(int)20,(int)20,(int)20,(int)20,(int)20,(int)20,(int)20,(int)20});
		CRNAQ.setStroke((int) 0, Color.parseColor("#000000"));
		linear11.setElevation((float) 5);
		linear11.setBackground(CRNAQ);
		int[] colorsCRNMU = { Color.parseColor("#ffffff"), Color.parseColor("#ffffff") }; android.graphics.drawable.GradientDrawable CRNMU = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNMU);
		CRNMU.setCornerRadii(new float[]{(int)20,(int)20,(int)20,(int)20,(int)20,(int)20,(int)20,(int)20});
		CRNMU.setStroke((int) 0, Color.parseColor("#000000"));
		linear16.setElevation((float) 5);
		linear16.setBackground(CRNMU);
		
		_typeface(textview4);
		_typeface(textview3);
		_typeface(textview17);
		_type_face(textview5);
		_type_face(textview6);
		_type_face(textview7);
		_type_face(textview8);
		_typeface_semibold(textview9);
		_typeface_semibold(textview10);
		_typeface_semibold(textview11);
		_typeface_semibold(textview12);
		_typeface_semibold(textview23);
		_type_face(textview13);
		_type_face(textview14);
		_type_face(textview15);
		_type_face(textview16);
		_type_face(textview18);
		_type_face(textview19);
		_type_face(textview20);
		_type_face(textview21);
		_type_face(textview22);
		_type_face(textview24);
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
	
	
	private void _Ripple_Effect (final View _v) {
		
		android.graphics.drawable.RippleDrawable ripdr1 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#BDBDBD")}), new android.graphics.drawable.ColorDrawable(Color.parseColor("#FFFFFF")), null);
		_v.setBackground(ripdr1);
	}
	
	
	private void _typeface (final TextView _textview) {
		_textview.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansbold.ttf"), 1);
	}
	
	
	private void _type_face (final TextView _view) {
		_view.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansregular.ttf"), 0);
	}
	
	
	private void _typeface_semibold (final TextView _tect) {
		_tect.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansmedium.ttf"), 0);
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
