<template>
    <div>
        <h2>회원 가입</h2>
        <form method="post">
            <div class="container">
                <label><b>Userid</b></label>
                <input type="text" v-model="userid" placeholder="Enter Userid" name="userid" required>
                <h3>입력한 아이디 : {{userid}}</h3>
                <label><b>Password</b></label>
                <input type="password" v-model="passwd" placeholder="Enter Password" name="passwd" required>
                <h3>입력한 비밀번호 : {{passwd}}</h3>
                <br>

                <div id='example-3'> 취미
                    <input type="checkbox" id="java" value="java" v-model="checkedNames">
                    <label for="java">JAVA</label>
                    <input type="checkbox" id="javascript" value="javascript" v-model="checkedNames">
                    <label for="javascript">Javascript</label>
                    <input type="checkbox" id="sql" value="sql" v-model="checkedNames">
                    <label for="sql">SQL</label>
                    <br>
                    <span>체크: {{ checkedNames }}</span>
                </div>
                <br>

                <textarea v-model="ect" placeholder="여러줄을 입력해보세요"></textarea>
                <span>입력내용:</span>
                <p style="white-space: pre-line">{{ ect }}</p>
                <br>

                성별 :
                <input type="radio" id="male" value="male" v-model="gender">
                <label for="male">남성</label>
                <input type="radio" id="female" value="female" v-model="gender">
                <label for="female">여성</label>
                <br>
                <span>선택: {{ gender }}</span>
                <br>
                <br>

                통신사
                <br>
                <select v-model="telecom">
                    <option disabled value="">Please select one</option>
                    <option>KT</option>
                    <option>SKT</option>
                    <option>LG</option>
                </select>
                <br>
                <span>선택: {{ telecom }}</span>
                <br>
                <br>

                개인정보 동의
                <input
                        type="checkbox"
                        v-model="confirm"
                        true-value="yes"
                        false-value="no"
                >
                <br>
                <span>선택: {{ confirm }}</span>

                <button @click="join" type="submit">회원가입</button>

                <label>
                    <input type="checkbox" checked="checked" name="remember"> Remember me
                </label>
            </div>

            <div class="container" style="background-color:#f1f1f1">
                <button type="button" class="cancelbtn">Cancel</button>
                <span class="psw">Forgot <a href="#">password?</a></span>
            </div>
        </form>
    </div >
</template>

<script>
    import {mapActions} from 'vuex'
    export default {
        data(){
            return{
                userid:'',
                passwd:'',
                checkedNames: [],
                ect:'',
                gender:'',
                telecom:'',
                confirm: false

            }
        },
        methods: mapActions ([
            'join'
        ])
    }
</script>

<style scoped>
    body {font-family: Arial, Helvetica, sans-serif;}
    form {border: 3px solid #f1f1f1;}

    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }

    button:hover {
        opacity: 0.8;
    }

    .cancelbtn {
        width: auto;
        padding: 10px 18px;
        background-color: #f44336;
    }

    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }

    img.avatar {
        width: 40%;
        border-radius: 50%;
    }

    .container {
        padding: 16px;
    }

    span.psw {
        float: right;
        padding-top: 16px;
    }

    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
    }
</style>