<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      E4 ViewNavi
    </div>
    <!-- 자바스크립트 객체를 쓸때는 반드시 콜론을 넣어준다 -->
    <div class="card-body">
      <P>
        <RouterLink to="/Ch02ComponentRouting/Exam01SingleFileComponent">Exam01SingleFileComponent</RouterLink>
      </P>
      <p>
        <RouterLink v-bind:to="`/Ch02ComponentRouting` + `/Exam01SingleFileComponent`">Exam01SingleFileComponent</RouterLink>
      </p>
      <p>
        <RouterLink :to="`/Ch02ComponentRouting` + `/Exam01SingleFileComponent`">Exam01SingleFileComponent</RouterLink>
      </p>

      <p>
        <RouterLink :to="{ path: '/Ch02ComponentRouting/Exam01SingleFileComponent' }">Exam01SingleFileComponent</RouterLink>
      </p>

      <p>
        <RouterLink :to="{ name: 'Exam03UseUIComponent' }">Exam03UseUIComponent</RouterLink>
      </p>

      <div>
        <h5>프로그램으로 화면 이동</h5>
        <p><button class="btn btn-info btn-sm" v-on:click="fun1()">Exam01SingleFileComponent</button></p>
        <p><button class="btn btn-info btn-sm" @click="goUrl('Exam01SingleFileComponent')">Exam01SingleFileComponent</button></p>

      </div>
    </div>

  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
// 자바스크립트를 작성
import { RouterLink, useRouter } from 'vue-router';

// 라우터 객체 얻기
const router = useRouter();

async function fun1() {
  // await router.push("/Ch02ComponentRouting/Exam01SingleFileComponent");

  // const path ="Exam01SingleFileComponent";
  // await router.push("/Ch02ComponentRouting/" + path)
  // }// await router.push("/Ch02ComponentRouting/Exam01SingleFileComponent");

  const path = "Exam01SingleFileComponent";
  await router.push(`/Ch02ComponentRouting/${path}`);
}

async function goUrl(path) {
  await router.push(`/Ch02ComponentRouting/${path}`);
}

</script>

scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다
<style scoped></style>