package b3nac.injuredandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import d.m.b.d;

public final class FlagSixLoginActivity extends c {
    private int t;

    static final class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FlagSixLoginActivity f1979c;

        a(FlagSixLoginActivity flagSixLoginActivity) {
            this.f1979c = flagSixLoginActivity;
        }

        public final void onClick(View view) {
            if (this.f1979c.F() == 0) {
                if (view != null) {
                    Snackbar X = Snackbar.X(view, "Keys.", 0);
                    X.Y("Action", (View.OnClickListener) null);
                    X.N();
                    FlagSixLoginActivity flagSixLoginActivity = this.f1979c;
                    flagSixLoginActivity.G(flagSixLoginActivity.F() + 1);
                    return;
                }
                d.f();
                throw null;
            } else if (this.f1979c.F() != 1) {
            } else {
                if (view != null) {
                    Snackbar X2 = Snackbar.X(view, "Classes.", 0);
                    X2.Y("Action", (View.OnClickListener) null);
                    X2.N();
                    this.f1979c.G(0);
                    return;
                }
                d.f();
                throw null;
            }
        }
    }

    public final int F() {
        return this.t;
    }

    public final void G(int i) {
        this.t = i;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_flag_six_login);
        i.g.a(this);
        C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new a(this));
    }

    public final void submitFlag(View view) {
        EditText editText = (EditText) findViewById(R.id.editText3);
        d.b(editText, "editText3");
        if (d.a(editText.getText().toString(), j.a("k3FElEG9lnoWbOateGhj5pX6QsXRNJKh///8Jxi8KXW7iDpk2xRxhQ=="))) {
            Intent intent = new Intent(this, FlagOneSuccess.class);
            FlagsOverview.D = true;
            new i().b(this, "flagSixButtonColor", true);
            startActivity(intent);
        }
    }
}
