let host = 'http://' + window.location.host;

$(document).ready(function () {
    const auth = getToken();
    if(auth === '') {
        window.location.href = host + "/api/user/login-page"; // 로그인 페이지로 리디렉션
    } else {
        $('#login-true').show();
        $('#login-false').hide();
    }
})

function logout() {
    // 토큰 삭제
    Cookies.remove('Authorization', { path: '/' });
    window.location.href = host + "/api/user/login-page";
}

function getToken() {
    let auth = Cookies.get('Authorization');

    if(auth === undefined) {
        return '';
    }

    return auth;
}