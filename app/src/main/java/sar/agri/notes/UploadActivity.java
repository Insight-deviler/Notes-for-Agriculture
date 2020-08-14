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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.graphics.Typeface;

public class UploadActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private HashMap<String, Object> map = new HashMap<>();
	private HashMap<String, Object> AgriEngineering = new HashMap<>();
	private HashMap<String, Object> econom = new HashMap<>();
	private HashMap<String, Object> Entomology = new HashMap<>();
	private HashMap<String, Object> GPB = new HashMap<>();
	private HashMap<String, Object> Pathology = new HashMap<>();
	private HashMap<String, Object> Statistics = new HashMap<>();
	private HashMap<String, Object> Extension = new HashMap<>();
	private HashMap<String, Object> Horticulture = new HashMap<>();
	private String Username = "";
	private HashMap<String, Object> Microbiology = new HashMap<>();
	private HashMap<String, Object> Soil_Science = new HashMap<>();
	private HashMap<String, Object> AHS = new HashMap<>();
	private HashMap<String, Object> gen_agri = new HashMap<>();
	private HashMap<String, Object> Nematology = new HashMap<>();
	private HashMap<String, Object> Biotechnology = new HashMap<>();
	private HashMap<String, Object> seed = new HashMap<>();
	private HashMap<String, Object> Bot = new HashMap<>();
	private HashMap<String, Object> Genetics = new HashMap<>();
	
	private ArrayList<String> CategoryList = new ArrayList<>();
	
	private LinearLayout linear18;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private ScrollView vscroll2;
	private TextView textview4;
	private TextView textview2;
	private EditText edittext1;
	private TextView textview3;
	private EditText edittext2;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear10;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private TextView textview1;
	private Button general_agriculture;
	private Button agronomy;
	private Button extension;
	private Button biotec;
	private Button economic;
	private Button entomology;
	private Button button3;
	private Button gpb;
	private Button horticulture;
	private Button pathology;
	private Button button2;
	private Button button1;
	private Button microbiology;
	private Button statistics;
	private Button soil_science;
	private Button nematode;
	private Button ahs;
	private Button agriengineering;
	
	private DatabaseReference qu = _firebase.getReference("Agronomy");
	private ChildEventListener _qu_child_listener;
	private DatabaseReference que = _firebase.getReference("Economic");
	private ChildEventListener _que_child_listener;
	private DatabaseReference ques = _firebase.getReference("AgriEngineering");
	private ChildEventListener _ques_child_listener;
	private DatabaseReference quest = _firebase.getReference("Extension");
	private ChildEventListener _quest_child_listener;
	private DatabaseReference questi = _firebase.getReference("Entomology");
	private ChildEventListener _questi_child_listener;
	private DatabaseReference questio = _firebase.getReference("Horticulture");
	private ChildEventListener _questio_child_listener;
	private DatabaseReference question = _firebase.getReference("GPB");
	private ChildEventListener _question_child_listener;
	private DatabaseReference questions = _firebase.getReference("Microbiology");
	private ChildEventListener _questions_child_listener;
	private DatabaseReference Q = _firebase.getReference("Pathology");
	private ChildEventListener _Q_child_listener;
	private DatabaseReference Qu = _firebase.getReference("Soil_Science");
	private ChildEventListener _Qu_child_listener;
	private DatabaseReference Que = _firebase.getReference("Statistics");
	private ChildEventListener _Que_child_listener;
	private DatabaseReference Ques = _firebase.getReference("Animal_Husbandry");
	private ChildEventListener _Ques_child_listener;
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
	private DatabaseReference general_agri = _firebase.getReference("General Agriculture");
	private ChildEventListener _general_agri_child_listener;
	private DatabaseReference nematology = _firebase.getReference("Nematology");
	private ChildEventListener _nematology_child_listener;
	private DatabaseReference biotechnology = _firebase.getReference("Biotechnology");
	private ChildEventListener _biotechnology_child_listener;
	private DatabaseReference seed_production = _firebase.getReference("Seed Production");
	private ChildEventListener _seed_production_child_listener;
	private DatabaseReference Botany = _firebase.getReference("Agriculture Botany");
	private ChildEventListener _Botany_child_listener;
	private DatabaseReference Gene_tics = _firebase.getReference("Gene_tics");
	private ChildEventListener _Gene_tics_child_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.upload);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview2 = (TextView) findViewById(R.id.textview2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		textview3 = (TextView) findViewById(R.id.textview3);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview1 = (TextView) findViewById(R.id.textview1);
		general_agriculture = (Button) findViewById(R.id.general_agriculture);
		agronomy = (Button) findViewById(R.id.agronomy);
		extension = (Button) findViewById(R.id.extension);
		biotec = (Button) findViewById(R.id.biotec);
		economic = (Button) findViewById(R.id.economic);
		entomology = (Button) findViewById(R.id.entomology);
		button3 = (Button) findViewById(R.id.button3);
		gpb = (Button) findViewById(R.id.gpb);
		horticulture = (Button) findViewById(R.id.horticulture);
		pathology = (Button) findViewById(R.id.pathology);
		button2 = (Button) findViewById(R.id.button2);
		button1 = (Button) findViewById(R.id.button1);
		microbiology = (Button) findViewById(R.id.microbiology);
		statistics = (Button) findViewById(R.id.statistics);
		soil_science = (Button) findViewById(R.id.soil_science);
		nematode = (Button) findViewById(R.id.nematode);
		ahs = (Button) findViewById(R.id.ahs);
		agriengineering = (Button) findViewById(R.id.agriengineering);
		fauth = FirebaseAuth.getInstance();
		user = getSharedPreferences("user", Activity.MODE_PRIVATE);
		
		general_agriculture.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					gen_agri = new HashMap<>();
					gen_agri.put("Question", edittext1.getText().toString().trim());
					gen_agri.put("Answer", edittext2.getText().toString().trim());
					gen_agri.put("User name", user.getString("email", "").trim());
					general_agri.push().updateChildren(gen_agri);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		agronomy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					map = new HashMap<>();
					map.put("Question", edittext1.getText().toString().trim());
					map.put("Answer", edittext2.getText().toString().trim());
					map.put("User name", user.getString("email", "").trim());
					qu.push().updateChildren(map);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		extension.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Extension = new HashMap<>();
					Extension.put("Question", edittext1.getText().toString().trim());
					Extension.put("Answer", edittext2.getText().toString().trim());
					Extension.put("User name", user.getString("email", "").trim());
					quest.push().updateChildren(Extension);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		biotec.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Biotechnology = new HashMap<>();
					Biotechnology.put("Question", edittext1.getText().toString().trim());
					Biotechnology.put("Answer", edittext2.getText().toString().trim());
					Biotechnology.put("User name", user.getString("email", "").trim());
					biotechnology.push().updateChildren(Biotechnology);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		economic.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					econom = new HashMap<>();
					econom.put("Question", edittext1.getText().toString().trim());
					econom.put("Answer", edittext2.getText().toString().trim());
					econom.put("User name", user.getString("email", "").trim());
					que.push().updateChildren(econom);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		entomology.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Entomology = new HashMap<>();
					Entomology.put("Question", edittext1.getText().toString().trim());
					Entomology.put("Answer", edittext2.getText().toString().trim());
					Entomology.put("User name", user.getString("email", "").trim());
					questi.push().updateChildren(Entomology);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Genetics = new HashMap<>();
					Genetics.put("Question", edittext1.getText().toString().trim());
					Genetics.put("Answer", edittext2.getText().toString().trim());
					Genetics.put("User name", user.getString("email", "").trim());
					Gene_tics.push().updateChildren(Genetics);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		gpb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					GPB = new HashMap<>();
					GPB.put("Question", edittext1.getText().toString().trim());
					GPB.put("Answer", edittext2.getText().toString().trim());
					GPB.put("User name", user.getString("email", "").trim());
					question.push().updateChildren(GPB);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		horticulture.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Horticulture = new HashMap<>();
					Horticulture.put("Question", edittext1.getText().toString().trim());
					Horticulture.put("Answer", edittext2.getText().toString().trim());
					Horticulture.put("User name", user.getString("email", "").trim());
					questio.push().updateChildren(Horticulture);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		pathology.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Pathology = new HashMap<>();
					Pathology.put("Question", edittext1.getText().toString().trim());
					Pathology.put("Answer", edittext2.getText().toString().trim());
					Pathology.put("User name", user.getString("email", "").trim());
					Q.push().updateChildren(Pathology);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Bot = new HashMap<>();
					Bot.put("Question", edittext1.getText().toString().trim());
					Bot.put("Answer", edittext2.getText().toString().trim());
					Bot.put("User name", user.getString("email", "").trim());
					Botany.push().updateChildren(Bot);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					seed = new HashMap<>();
					seed.put("Question", edittext1.getText().toString().trim());
					seed.put("Answer", edittext2.getText().toString().trim());
					seed.put("User name", user.getString("email", "").trim());
					seed_production.push().updateChildren(seed);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		microbiology.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Microbiology = new HashMap<>();
					Microbiology.put("Question", edittext1.getText().toString().trim());
					Microbiology.put("Answer", edittext2.getText().toString().trim());
					Microbiology.put("User name", user.getString("email", "").trim());
					questions.push().updateChildren(Microbiology);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		statistics.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Statistics = new HashMap<>();
					Statistics.put("Question", edittext1.getText().toString().trim());
					Statistics.put("Answer", edittext2.getText().toString().trim());
					Statistics.put("User name", user.getString("email", "").trim());
					Que.push().updateChildren(Statistics);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		soil_science.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Soil_Science = new HashMap<>();
					Soil_Science.put("Question", edittext1.getText().toString().trim());
					Soil_Science.put("Answer", edittext2.getText().toString().trim());
					Soil_Science.put("User name", user.getString("email", "").trim());
					Qu.push().updateChildren(Soil_Science);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		nematode.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					Nematology = new HashMap<>();
					Nematology.put("Question", edittext1.getText().toString().trim());
					Nematology.put("Answer", edittext2.getText().toString().trim());
					Nematology.put("User name", user.getString("email", "").trim());
					nematology.push().updateChildren(Nematology);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		ahs.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					AHS = new HashMap<>();
					AHS.put("Question", edittext1.getText().toString().trim());
					AHS.put("Answer", edittext2.getText().toString().trim());
					AHS.put("User name", user.getString("email", "").trim());
					Ques.push().updateChildren(AHS);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		agriengineering.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((0 < edittext1.getText().toString().length()) && (0 < edittext2.getText().toString().length())) {
					AgriEngineering = new HashMap<>();
					AgriEngineering.put("Question", edittext1.getText().toString().trim());
					AgriEngineering.put("Answer", edittext2.getText().toString().trim());
					AgriEngineering.put("User name", user.getString("email", "").trim());
					ques.push().updateChildren(AgriEngineering);
					edittext1.setText("");
					edittext2.setText("");
					InsightUtil.showMessage(getApplicationContext(), "Uploaded ❤️");
				}
				else {
					InsightUtil.showMessage(getApplicationContext(), "Enter Question and Answer");
				}
			}
		});
		
		_qu_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		qu.addChildEventListener(_qu_child_listener);
		
		_que_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		que.addChildEventListener(_que_child_listener);
		
		_ques_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		ques.addChildEventListener(_ques_child_listener);
		
		_quest_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		quest.addChildEventListener(_quest_child_listener);
		
		_questi_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		questi.addChildEventListener(_questi_child_listener);
		
		_questio_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		questio.addChildEventListener(_questio_child_listener);
		
		_question_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		question.addChildEventListener(_question_child_listener);
		
		_questions_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		questions.addChildEventListener(_questions_child_listener);
		
		_Q_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Q.addChildEventListener(_Q_child_listener);
		
		_Qu_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Qu.addChildEventListener(_Qu_child_listener);
		
		_Que_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Que.addChildEventListener(_Que_child_listener);
		
		_Ques_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Ques.addChildEventListener(_Ques_child_listener);
		
		_general_agri_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		general_agri.addChildEventListener(_general_agri_child_listener);
		
		_nematology_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		nematology.addChildEventListener(_nematology_child_listener);
		
		_biotechnology_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		biotechnology.addChildEventListener(_biotechnology_child_listener);
		
		_seed_production_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		seed_production.addChildEventListener(_seed_production_child_listener);
		
		_Botany_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Botany.addChildEventListener(_Botany_child_listener);
		
		_Gene_tics_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Gene_tics.addChildEventListener(_Gene_tics_child_listener);
		
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
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansmedium.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansmedium.ttf"), 0);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansmedium.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansbold.ttf"), 1);
		edittext1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansregular.ttf"), 0);
		edittext2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansregular.ttf"), 0);
		
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
		_setElevation(linear18, 10);
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
