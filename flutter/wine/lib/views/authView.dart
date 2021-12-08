import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:wine/components/signInButton.dart';

class AuthView extends StatefulWidget {
  @override
  State<AuthView> createState() => _AuthViewState();
}

class _AuthViewState extends State<AuthView> {
  String _email = "";
  String _password = "";
  bool _isSigningIn = false;
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        decoration: BoxDecoration(
          gradient: LinearGradient(
            begin: Alignment.topLeft,
            end: Alignment.bottomRight,
            colors: <Color>[
              Color(0xffd500f9),
              Color(0xff8e24aa),
              Color(0xff4a148c),
            ], 
          ),
        ),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[

            SizedBox(
              child: Padding(
                padding: const EdgeInsets.all(8.0),
                child: Image.asset("assets/images/logo.png", width: 100, height: 100),
              ),
            ),

            Container(
              child: Padding(
                padding: const EdgeInsets.fromLTRB(0, 10, 0, 10),
                child: Text(
                  "WINE",
                  textAlign: TextAlign.center,
                  style: TextStyle(
                    fontSize: 30,
                    fontWeight: FontWeight.w700,
                    color: Color(0xffffe0b2),
                  ),
                ),
              ),
            ),

            SignInButton(
              "Sign in", 
              "assets/images/login.png",
              Colors.black87
            ),
            
            SignInButton(
              "Google",
              "assets/images/google.png",
              Color(0xff283593)
            ),

            SignInButton(
              "Instagram",
              "assets/images/instagram.png",
              Color(0xffad1457)
            ),

            SizedBox(height: 30),

            Container(
              child: Padding(
                padding: const EdgeInsets.all(8.0),
                child: Text(
                  "version 1.0.1",
                  style: TextStyle(
                    fontSize: 18,
                    color: Colors.amber
                  ),
                ),
              ),
            ),

            Container(
              child: Padding(
                padding: const EdgeInsets.all(2.0),
                child: Text(
                  "create by Mauricio Mityo Hidani",
                  style: TextStyle(
                    fontSize: 16,
                    color: Color(0xffba68c8)
                  ),
                ),
              ),
            )

          ],
        ),
      ),
    );
  }
}