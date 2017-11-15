package org.digidaw.ruangkelas.Profile;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import org.digidaw.ruangkelas.R;

public class SignOutFragment extends Fragment {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    private ProgressBar mProgressBar;
    private TextView tvSignOut;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_out, container, false);
        tvSignOut = (TextView) view.findViewById(R.id.textConfirmSignout);
        mProgressBar = (ProgressBar) view.findViewById(R.id.progressLogout);
        mProgressBar.setVisibility(View.GONE);

        Button btnConfirm = (Button) view.findViewById(R.id.btnConfirmSignout);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mProgressBar.setVisibility(View.VISIBLE);
                mAuth.signOut();
                getActivity().finish();
            }
        });

        return view;
    }
}
