import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class SignInButton extends StatelessWidget {
  String _label = "Sign in with exists Account";
  String _icon = "assets/images/login.png";
  Color _color = Colors.black87;
  bool _isSigningIn = false;

  SignInButton(this._label, this._icon, this._color);
  
  @override
  Widget build(BuildContext context) {
    return Container(
      margin: const EdgeInsets.fromLTRB(30, 10, 30, 10),
      child: OutlinedButton(
        style: ButtonStyle(
          backgroundColor: MaterialStateProperty.all(Color(0xFFFAFAFA)),
          shape: MaterialStateProperty.all(
            RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(100),
            ),
          ),
        ),
        onPressed: () async {
          _isSigningIn != _isSigningIn;
        }, 
        child: Padding(
          padding: const EdgeInsets.fromLTRB(20, 10, 20, 10), 
          child: Row(
            crossAxisAlignment: CrossAxisAlignment.center,
            children: <Widget>[
              Image(
                image: AssetImage(_icon), 
                width: 35.0,
                height: 35.0,
              ),
              Padding(
                padding: const EdgeInsets.only(left: 10),
                child: Text(
                  _label,
                  style: TextStyle(
                    fontSize: 20, 
                    color: _color,
                    fontWeight: FontWeight.w600,
                  ),
                ),
              )
            ],
          ),
        ),
      ),
    );
  }
}