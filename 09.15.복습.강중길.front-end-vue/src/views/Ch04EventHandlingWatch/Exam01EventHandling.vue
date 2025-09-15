<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">

    </div>
    <div class="card-body">
<!-- <button class='btn btn-info btn-sm' @click='changeState()'></button> -->

 <div class="mb-3">
    <button class='btn btn-info btn-sm' @click='handleBtn1'>버튼1</button>
    <button id="btn2" class='btn btn-info btn-sm' @click='handleBtn2("vue is good", $event)'>버튼2</button>
    <button id="btn3" class='btn btn-info btn-sm' @click='handleBtn2("react is bad", $event)'>버튼3</button>
 </div>

 <div>
    <form @submit.prevent="handleForm">
      <div class="input-group mb-3">
        <span class="input-group-text">이메일</span>
        <input id="userEmail" type="email" class="form-control" v-model="userEmail"/>
      </div>

      <div>입력내용: {{ userEmail }}</div>
      <input type="submit" value="제출" class="btn btn-info btn-sm mt-2"/>
    </form>
 </div>

    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref } from 'vue';

  // 자바스크립트를 작성
  function handleBtn1() {
    console.log("handelbtn1 실행;");
  }

  function handleBtn2(arg, event) {
    console.log("handelbtn2 실행;");
    console.log("arg:", arg);
    console.log('event.target:', event.target);
    console.log('botton.id:', event.target.id);

    if (event.target.id === 'btn2') {
       console.log("btn2 클릭됨;");
    } else if(event.target.id === 'btn3') {
      console.log("btn3 클릭됨;");
    }

  }

  function handleForm() {
    const uEmail = document.querySelector("#userEmail").value;
    console.log(uEmail);

    console.log("그냥 상태값 바로 가져오면 댐 아이디 쓰지말고", userEmail.value);
  }

  
  const userEmail = ref("");

  
  

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped> 

</style>