import 'package:flutter/material.dart';
import 'package:wine/views/authView.dart';

class AppWidget extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Wine",
      theme: ThemeData.dark(

      ),
      home: AuthView(),
    );
  }
}