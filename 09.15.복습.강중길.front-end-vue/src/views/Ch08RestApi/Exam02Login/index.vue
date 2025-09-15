<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">

    </div>
    <div class="card-body">
      <!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->


      <div v-if="store.state.user === ''">
      <form @submit.prevent="handleLogin">
        <div class="input-group mb-2">
          <span class="input-group-text">아이디</span>
          <input type="text" class="form-control" v-model="loginForm.mid">
        </div>

        <div class="input-group mb-3">
          <span class="input-group-text">비밀번호</span>
          <input type="password" class="form-control" v-model="loginForm.mpassword">
        </div>

        <div class="d-flex justify-content-center">
          <input type="submit" value="로그인" class="btn btn-success btn-sm me-2" />
          <!--Vue에서 리셋 버튼은 양식을 초기화하지 않음-->
          <!-- <input type="reset" value="재작성" class="btn btn-info btn-sm"/> -->
          <button type="button" class="btn btn-info btn-sm" @click="handleReset">재작성</button>
        </div>
      </form>
      </div>

      <div v-if="store.state.user !== ''">
        <button class="btn btn-info btn-sm" @click="handleLogout">로그아웃</button>
      </div>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref } from 'vue';
import memberApi from '@/apis/memberApi';
import { useStore } from 'vuex';

import { useRouter } from 'vue-router';

const router = useRouter();

// 전역 상태를 읽고, 변경하기 위해 Store 얻기
const store = useStore();

// 자바스크립트를 작성
// 상태 정의
const loginForm = ref({
  mid: "user1",
  mpassword: "12345"
})

// 이벤트 처리 함수
async function handleLogin() {
  try {
    const data = structuredClone(loginForm.value);
    const response = await memberApi.memberLogin(data);
    const result = response.data;

    if (result.result === "success") {
      console.log("mid", result.mid);
      console.log("jwt", result.jwt);

      store.dispatch("saveAuth", result);
      // store.dispatch("saveAuth", {mid:result.mid, jwt:result.jwt}); 이 형태로도 된다.

      await router.push("/");

    } else {
      console.log(result.message);
    }

  } catch (error) {
    console.log(error);
  }
}

function handleReset() {

}


function handleLogout() {
  store.dispatch("removeAuth");
}



</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>