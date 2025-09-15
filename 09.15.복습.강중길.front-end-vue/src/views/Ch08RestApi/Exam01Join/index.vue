<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      Exam01Join
    </div>
    <div class="card-body">
      <!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->

      
      <form @submit.prevent="handleSubmit">
        <div class="input-group mb-2">
          <span class="input-group-text">아이디</span>
          <input type="text" class="form-control" v-model="member.mid">
        </div>

        <div class="input-group mb-2">
          <span class="input-group-text">이름</span>
          <input type="text" class="form-control" v-model="member.mname">
        </div>

        <div class="input-group mb-2">
          <span class="input-group-text">비밀번호</span>
          <input type="password" class="form-control" v-model="member.mpassword">
        </div>

        <div class="input-group mb-3">
          <span class="input-group-text">역할</span>
          <select class="form-control" v-model="member.mrole">
            <option value="ROLE_ADMIN">admin</option>
            <option value="ROLE_USER">user</option>
            <option value="ROLE_BLA">bla</option>
          </select>


        </div>

        <div class="input-group mb-3">
          <span class="input-group-text">이메일</span>
          <input type="email" class="form-control" v-model="member.memail">
        </div>

        <div class="d-flex justify-content-center">
          <input type="submit" value="가입" class="btn btn-danger btn-sm me-2" />
          <!--Vue에서 리셋 버튼은 양식을 초기화하지 않음-->
          <!-- <input type="reset" value="재작성" class="btn btn-info btn-sm"/> -->
          <button type="button" class="btn btn-info btn-sm" @click="handleReset">재작성</button>
        </div>
      </form>
      
      

    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref } from 'vue';
import memberApi from '@/apis/memberApi';

import { useRouter } from 'vue-router';

const router = useRouter();

// 자바스크립트를 작성
const member = ref({
  "mid": "user11",
  "mname": "사용자11",
  "mpassword": "12345",
  "menabled": true,
  "mrole": "ROLE_USER",
  "memail": "user1@sgg.com"
});

async function handleSubmit() {
  try {
    //순수 자바스크립트 객체로 변환
    const data = structuredClone(member.value);
    console.log(data);


    // 되도록 여기서 중복체크부터(DB랑 대조해서)
    // REST Api 호출
    const response = await memberApi.memberCreate(data);

    const resultObject = response.data; //

    if (resultObject.result == "success") {
      // 로그인 페이지로 이동
      await router.push("/Ch08RestApi/Exam02Login");
    } else {
      window.alert(resultObject.message);
    }
  } catch (error) {
    console.log(error); // 서버 통신문제
  }
}

function handleReset() {
  member.value = {
    "mid": "",
    "mname": "",
    "mpassword": "",
    "menabled": true,
    "mrole": "ROLE_USER",
    "memail": ""
  }
}








</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>