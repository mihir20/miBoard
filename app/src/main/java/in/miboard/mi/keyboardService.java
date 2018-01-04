package in.miboard.mi;

import android.app.Service;
import android.content.Intent;
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.os.IBinder;
import android.view.View;

public class keyboardService extends InputMethodService implements KeyboardView.OnKeyboardActionListener {
    public keyboardService() {
    }
    private KeyboardView keyboardView;
    private Keyboard keyboard;

    private boolean isCaps = false;

    @Override
    public View onCreateInputView() {
        keyboardView = ((KeyboardView) getLayoutInflater()
                .inflate( R.layout.keyboard, null ));
        keyboard = new Keyboard(this,R.xml.qwerty );
        keyboardView.setKeyboard( keyboard );
        keyboardView.setOnKeyboardActionListener(this);
        return keyboardView;
    }

    @Override
    public void onPress(int primaryCode) {

    }

    @Override
    public void onRelease(int primaryCode) {

    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {

    }

    @Override
    public void onText(CharSequence text) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
