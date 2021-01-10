import React from 'react';
import { StyleSheet, Text, View, Image } from 'react-native';

function Header() {
    return (
        <View style={styles.container}>
            <Image source={require('../assets/logo.png')} />
            <Text style={styles.text}>STT-Delivery</Text>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#DA5C5C',
        height: 120,
        paddingTop: 70,
        flexDirection: 'row',
        justifyContent:'center'
    },
    text: {
        fontWeight: 'bold',
        fontSize: 18,
        lineHeight: 25,
        letterSpacing: -0.24, //Reac-native não converte (em) devera efetuar a conversão manualmente multiplicando por 16
        color: '#FFF',
        marginLeft: 15,
        fontFamily: 'OpenSans_700Bold'
    }
});

export default Header;

